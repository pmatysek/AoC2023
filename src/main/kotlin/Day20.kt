import Module.ModuleType.BROADCASTER
import Module.ModuleType.CONJUNCTION
import Module.ModuleType.FLIP_FLOP
import java.io.File

fun main() {
    part1()
    part2()
}

private fun part1() {
    val modulesMap = "day20".getInputLines().map {
        val splitted = it.split(" -> ")
        val type = when (splitted.first().first()) {
            '%' -> FLIP_FLOP
            '&' -> CONJUNCTION
            else -> BROADCASTER
        }
        val name = when (type) {
            BROADCASTER -> splitted.first()
            else -> splitted.first().drop(1)
        }
        val outputModules = splitted.second().split(", ")
        Module(
            name = name,
            type = type,
            outputModules = outputModules,
            isOn = if (type == FLIP_FLOP) false else null,
        )
    }.associateBy { it.name }
    modulesMap.values.filter { it.type == CONJUNCTION }.forEach { module ->
        val inputs = modulesMap.values.filter { module.name in it.outputModules }.map { it.name }
        module.memory = inputs.associateWith { false }.toMutableMap()
    }
    var lowPulses = 0uL
    var highPulses = 0uL
    repeat(1000) { i ->
        val queue = arrayDequeOf(
            InputData(
                moduleName = "broadcaster",
                pulse = false,
                sender = "broadcaster",
            ),
        )
        while (queue.isNotEmpty()) {
            val (moduleName, pulse, sender) = queue.removeFirst()
            if (moduleName == "rx" && !pulse) {
                println(i)
            }
            if (pulse) {
                highPulses += 1uL
            } else {
                lowPulses += 1uL
            }
            val module = modulesMap[moduleName] ?: continue
            when (module.type) {
                BROADCASTER -> queue.addAll(
                    module.outputModules.map {
                        InputData(
                            moduleName = it,
                            pulse = false,
                            sender = moduleName,
                        )
                    },
                )

                FLIP_FLOP -> if (!pulse) {
                    module.isOn = !module.isOn!!
                    queue.addAll(
                        module.outputModules.map {
                            InputData(
                                moduleName = it,
                                pulse = module.isOn!!,
                                sender = moduleName,
                            )
                        },
                    )
                }

                CONJUNCTION -> {
                    module.memory[sender] = pulse
                    val newPulse = !module.memory.values.all { it }
                    queue.addAll(
                        module.outputModules.map {
                            InputData(
                                moduleName = it,
                                pulse = newPulse,
                                sender = moduleName,
                            )
                        },
                    )
                }
            }
        }
    }
    println(highPulses * lowPulses)
}

private fun part2() {
    val modulesMap = "day20".getInputLines().map {
        val splitted = it.split(" -> ")
        val type = when (splitted.first().first()) {
            '%' -> FLIP_FLOP
            '&' -> CONJUNCTION
            else -> BROADCASTER
        }
        val name = when (type) {
            BROADCASTER -> splitted.first()
            else -> splitted.first().drop(1)
        }
        val outputModules = splitted.second().split(", ")
        Module(
            name = name,
            type = type,
            outputModules = outputModules,
            isOn = if (type == FLIP_FLOP) false else null,
        )
    }.associateBy { it.name }
    modulesMap.values.filter { it.type == CONJUNCTION }.forEach { module ->
        val inputs = modulesMap.values.filter { module.name in it.outputModules }.map { it.name }
        module.memory = inputs.associateWith { false }.toMutableMap()
    }
    var lowPulses = 0uL
    var highPulses = 0uL
    val print = true
    val file = File("day20.MD").printWriter()
    file.println("```mermaid")
    file.println("flowchart TD")
    val printed: MutableSet<InputData> = mutableSetOf()
    repeat(100000) { i ->
        val queue = arrayDequeOf(
            InputData(
                moduleName = "broadcaster",
                pulse = false,
                sender = "broadcaster",
            ),
        )
        while (queue.isNotEmpty()) {
            val input = queue.removeFirst()
            val (moduleName, pulse, sender) = input
            if (print && printed.add(input)) {
                val pulseText = if (pulse) "high $i" else "low $i"
                file.println("$sender -->|$pulseText| $moduleName")
            }
            if (moduleName == "rx" && !pulse) {
                println("low pulse to rx at i")
                return
            }
            if (pulse) {
                highPulses += 1uL
            } else {
                lowPulses += 1uL
            }
            val module = modulesMap[moduleName] ?: continue
            when (module.type) {
                BROADCASTER -> queue.addAll(
                    module.outputModules.map {
                        InputData(
                            moduleName = it,
                            pulse = false,
                            sender = moduleName,
                        )
                    },
                )

                FLIP_FLOP -> if (!pulse) {
                    module.isOn = !module.isOn!!
                    queue.addAll(
                        module.outputModules.map {
                            InputData(
                                moduleName = it,
                                pulse = module.isOn!!,
                                sender = moduleName,
                            )
                        },
                    )
                }

                CONJUNCTION -> {
                    module.memory[sender] = pulse
                    val newPulse = !module.memory.values.all { it }
                    queue.addAll(
                        module.outputModules.map {
                            InputData(
                                moduleName = it,
                                pulse = newPulse,
                                sender = moduleName,
                            )
                        },
                    )
                }
            }
        }
    }
    file.println("```")
    file.close()
    println(highPulses * lowPulses)
}

data class InputData(
    val moduleName: String,
    val pulse: Boolean,
    val sender: String,
)
data class Module(
    val name: String,
    val type: ModuleType,
    val outputModules: List<String>,
    var isOn: Boolean?,
    var memory: MutableMap<String, Boolean> = mutableMapOf(),

) {
    enum class ModuleType {
        FLIP_FLOP,
        CONJUNCTION,
        BROADCASTER,
    }
}
