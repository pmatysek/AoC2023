# Advent Of Code 2023

## Visualizations

### Day 10
```
                                                       ┏━┓┏┓ ┏━━┓                                                                           
                                                       ┗┓┃┃┗┓┗┓┏┛                                                                           
                                    ┏┓                  ┃┃┗┓┗━┛┗┓                                                                           
                                    ┃┗━┓               ┏┛┗━┛┏━━━┛                                                                           
                                    ┗┓┏┛            ┏┓ ┗━━┓┏┛┏┓┏┓                                                                           
                                     ┃┃┏━┓┏┓ ┏┓     ┃┃ ┏┓┏┛┃┏┛┃┃┗━┓                                                                         
                                   ┏┓┃┗┛┏┛┃┃┏┛┃     ┃┃┏┛┃┗┓┃┃┏┛┃┏━┛        ┏┓        ┏━┓┏┓                                                  
                                ┏┓ ┃┃┗━┓┃ ┃┃┃┏┛ ┏┓┏┓┃┃┗┓┃ ┃┃┃┗┓┃┗┓┏┓    ┏┓┏┛┗┓┏┓     ┗┓┃┃┃┏━┓                                               
                               ┏┛┗┓┃┃┏┓┃┗━┛┃┃┃┏┓┃┃┃┃┃┃┏┛┗━┛┗┛┏┛┃┏┛┃┗┓  ┏┛┃┗┓┏┛┃┃     ┏┛┗┛┗┛┏┛                                               
                            ┏┓ ┗━┓┗┛┃┃┗┛┏┓┏┛┃┃┃┃┃┗┛┗┛┗┛┏━┓┏━┓┗┓┃┗━┛┏┛  ┗┓┃┏┛┗┓┃┗┓    ┗━┓┏━━┛                   ┏┓                           
                         ┏┓ ┃┃┏━┓┗━┓┃┃┏━┛┗┛┏┛┃┃┃┗━┓┏┓┏┓┗┓┗┛ ┗┓┃┃┏━━┛  ┏━┛┃┃┏━┛┃┏┛   ┏┓┏┛┗━┓  ┏┓┏┓         ┏━┓ ┏┛┗━┓    ┏━┓                  
                         ┃┃┏┛┃┗┓┃┏┓┃┃┃┗━━━┓┗┓┗┛┃┏┓┗┛┗┛┗━┛┏┓ ┏┛┗┛┗┓┏┓┏┓┗┓┏┛┃┃┏┓┃┃ ┏━┓┃┃┗┓┏━┛ ┏┛┃┃┃┏┓┏┓     ┗┓┃ ┗┓┏━┛    ┗┓┗┓                 
                     ┏━━┓┃┗┛┏┛ ┃┃┃┗┛┗┛┏━━━┛┏┛┏━┛┃┗┓┏━━┓┏━┛┗┓┗┓┏━━┛┃┃┃┗┓┃┗━┛┗┛┗┛┗┓┗┓┃┃┃┏┛┗┓  ┗┓┃┃┃┃┗┛┗┓┏━┓┏┓┃┃┏━┛┗┓      ┃┏┛    ┏┓           
                     ┗━┓┗┛┏━┛ ┏┛┃┃┏━━┓┗━┓┏━┛┏┛┏┓┗┓┃┗┓┏┛┗━━┓┃┏┛┗┓┏┓┃┗┛┏┛┃┏━━━━━━━┛ ┃┗┛┗┛┏┓┃┏┓ ┃┃┃┃┃┏┓┏┛┗┓┗┛┗┛┃┗┓┏━┛ ┏┓┏━━┛┃┏┓ ┏┓┃┃           
                  ┏━━┓ ┃┏┓┗┓┏┓┗┓┗┛┗━┓┗━━┛┗━┓┗┓┃┗┓┃┃┏┛┗┓ ┏┓┃┃┗━┓┃┃┃┃┏━┛ ┃┃┏┓┏━━┓ ┏┓┗━━┓┏┛┗┛┃┗━┛┗┛┃┗┛┃┗━┓┃┏━━┓┗┓┃┗━━┓┃┃┗━━┓┗┛┗┓┃┃┃┃┏┓         
                  ┗━┓┃ ┗┛┗┓┗┛┃ ┗━┓┏━┛┏┓ ┏┓ ┗┓┃┃┏┛┃┃┗┓┏┛┏┛┗┛┗━━┛┃┃┃┃┃┏━┓┃┃┃┃┃┏┓┃┏┛┃ ┏┓┃┃ ┏┓┗┓┏┓┏┓┗┓┏┛┏━┛┗┛┏┓┗┓┃┃┏━┓┃┃┗━━┓┗━┓┏┛┃┃┃┗┛┗┓        
                  ┏━┛┃┏┓  ┗┓┏┛┏━┓┃┃┏━┛┗┓┃┃┏━┛┃┃┃┏┛┗━┛┗┓┗━━━━━━┓┃┃┗┛┃┃┏┛┃┃┃┃┃┃┗┛┗┓┗┓┃┃┃┃┏┛┗┓┗┛┗┛┃┏┛┃┏┛┏┓┏┓┃┗┓┃┗┛┃ ┃┃┗━━┓┗┓ ┃┗━┛┗┛┏┓┏┛        
                  ┗━┓┃┃┃ ┏━┛┗┓┗┓┗┛┗┛┏━┓┃┃┃┗━┓┗┛┃┗┓┏━━━┛┏━━┓┏┓┏┛┃┃┏━┛┃┗┓┃┗┛┗┛┗┓┏┓┗┓┃┃┃┃┃┃┏━┛ ┏┓┏┛┃┏┛┃┏┛┃┃┃┗┓┃┗━┓┗┓┗┛ ┏┓┃┏┛┏┛┏┓┏┓┏┛┗┛         
                   ┏┛┃┃┗┓┗┓┏┓┗┓┗━┓┏━┛ ┗┛┃┗┓ ┗━┓┃┏┛┃┏┓┏┓┗━┓┃┃┃┗┓┃┃┃ ┏┛┏┛┃┏━━┓┏┛┃┃ ┃┃┃┃┃┗┛┗┓┏┓┃┃┗┓┃┗┓┗┛┏┛┃┃┏┛┗━┓┗┓┗┓┏┓┃┗┛┃ ┃┏┛┃┃┃┃            
                ┏┓ ┗┓┃┃┏┛ ┗┛┗┓┗┓┏┛┗━┓ ┏┓┃┏┛┏━━┛┃┗┓┗┛┃┃┗━┓┃┗┛┗┓┃┃┃┃┏┛┏┛ ┃┗━┓┗┛ ┃┃┏┛┗┛┃┃┏━━┛┃┃┃┃┏┛┗┓┗━┓┗┓┃┃┃┏━━┛ ┗┓┗┛┃┗━┓┗┓┃┗┓┃┃┗┛            
              ┏┓┃┃┏━┛┗┛┃┏┓┏━┓┗┓┃┃┏━━┛┏┛┗┛┗┓┗━━┓┃┏┛┏━┛┗━┓┃┗━━┓┗┛┗┛┃┗┓┃┏┓┃┏━┛┏┓┏┛┃┃┏━┓┗┛┗━┓ ┃┃┃┃┗━┓┗┓┏┛┏┛┃┗┛┃ ┏┓┏┓┗┓┏┛┏┓┃┏┛┃┏┛┃┗┓             
            ┏┓┃┃┃┃┗━━━┓┃┃┃┃┏┛┏┛┗┛┗━━┓┃┏┓┏┓┗┓┏┓┃┃┃┏┛┏┓┏┓┃┃ ┏┓┗━━┓┏┛┏┛┗┛┗┛┗━━┛┗┛┏┛┗┛ ┃┏━━┓┃┏┛┃┃┗┓┏┛┏┛┗┓┃┏┛┏┓┗┓┃┗┛┗┓┃┗┓┃┗┛┗━┛┗┓┗━┛             
           ┏┛┗┛┗┛┗━┓ ┏┛┃┃┗┛┗┓┗━┓┏━━┓┃┃┃┗┛┗┓┃┃┗┛┃┃┃┏┛┃┃┃┃┃┏┛┗━━━┛┃ ┃┏━━━━┓┏━┓┏━┛┏┓┏┓┃┃┏┓┗┛┃┏┛┃┏┛┃┏┛ ┏┛┃┗━┛┗┓┃┃┏━━┛┃┏┛┃┏━━━┓┏┛┏┓┏┓            
           ┗━━━━┓┏┓┗┓┗┓┃┗┓┏┓┃┏┓┃┃┏┓┗┛┗┛ ┏┓┃┃┃┏━┛┃┃┗┓┃┃┃┃┃┗┓┏━━━┓┃┏┛┃ ┏━┓┗┛ ┗┛ ┏┛┃┃┃┃┃┃┗┓ ┃┗┓┃┃ ┃┃┏┓┃┏┛ ┏┓ ┃┗┛┗━┓┏┛┗━┛┃ ┏┓┗┛ ┃┃┃┗━┓          
            ┏┓┏┓┗┛┗┓┗━┛┗┓┗┛┃┗┛┃┃┗┛┗┓┏┓ ┏┛┗┛┗┛┗━┓┃┃┏┛┗┛┃┃┗┓┗┛ ┏━┛┗┛┏┛┏┛┏┛┏━━━━┓┗┓┗┛┗┛┃┃┏┛┏┛┏┛┃┗┓┃┗┛┗┛┗┓┏┛┗┓┃┏━┓┏┛┗┓┏━━┛┏┛┗━━┓┃┃┃┏━┛   ┏┓     
         ┏┓┏┛┃┃┃┏━━┛┏┓┏┓┗━━┛┏━┛┗━┓┏┛┃┃┏┛┏━━━┓┏━┛┃┃┃┏┓┏┛┃┏┛ ┏┓┗━━━┓┗┓┃┏┛ ┃┏━━━┛┏┛┏┓┏━┛┃┗┓┗┓┗┓┗┓┃┗━━┓┏━┛┗━┓┗┛┃ ┃┃┏━┛┗┓ ┏┛┏━━━┛┃┃┃┗┓┏┓ ┏┛┗┓    
        ┏┛┃┗┓┃┃┃┗━━━┛┗┛┗━━━┓┃┏┓┏┓┃┗━┛┃┗━┛┏━━┛┗━┓┃┗┛┃┗┛┏┛┗━┓┃┗┓┏━━┛┏┛┃┗━━┛┃┏━┓┏┛┏┛┃┃┏┓┗┓┗━┛┏┛┏┛┗┓┏┓┃┗━┓ ┏┛┏┓┗┓┗┛┗━━┓┗┓┗┓┃┏┓┏┓┃┃┗┓┗┛┗┓┃┏━┛    
        ┗┓┗━┛┗┛┗━━━━━━━━━━━┛┃┃┃┃┃┗┓┏━┛┏━┓┗┓┏━┓┏┛┗━┓┃┏┓┗┓┏━┛┃┏┛┗━━┓┗┓┗┓┏━━┛┃┏┛┗━┛┏┛┃┃┗━┛┏━━┛ ┗┓┏┛┃┃┃┏━┛┏┛┏┛┗━┛┏┓ ┏┓┃┏┛ ┃┗┛┃┃┃┃┃ ┃┏━━┛┃┗━┓    
         ┗━━━┓┏━━━┓┏┓┏┓┏┓┏━┓┗┛┗┛┗┓┃┗━┓┃┏┛ ┗┛┏┛┃┏┓┏┛┃┃┗┓┃┃┏┓┃┃┏┓┏┓┃┏┛┏┛┗━┓┏┛┃┏┓┏━┛┏┛┗━┓┏┛ ┏┓ ┏┛┗┓┃┃┃┗┓┏┛┏┛┏━━┓┃┃┏┛┗┛┃┏┓┃┏━┛┃┗┛┃┏┛┗━┓ ┃┏━┛    
           ┏┓┗┛┏┓ ┗┛┗┛┃┃┃┃ ┗━┓┏━┓┗┛┏┓┃┃┃ ┏━┓┗┓┃┃┃┗┓┃┗┓┃┃┃┃┃┃┗┛┗┛┃┃┗━┛┏┓┏┛┃┏┛┃┃┃┏┓┗━━┓┃┃┏┓┃┗┓┗━┓┃┃┗┛┏┛┗┓┗━┛┏━┛┃┃┗━┓┏┛┃┃┃┃┏┓┗┓┏┛┃┏━┓┗━┛┗━━━━┓ 
          ┏┛┗━┓┃┃┏┓┏━┓┗┛┗┛┏━━┛┃┏┛┏┓┃┗┛┃┃┏┛┏┛┏┛┃┃┗━┛┃ ┃┃┃┗┛┃┃┏━━┓┗┛┏━━┛┗┛┏┛┗┓┃┃┗┛┗━┓┏┛┃┃┃┃┃┏┛┏┓┃┃┗━┓┗┓┏┛┏━━┛┏┓┃┗┓ ┃┗━┛┗┛┃┃┗━┛┗━┛┗┓┃┏┓┏┓┏━┓┏┛ 
          ┗━━┓┗┛┗┛┃┗┓┃┏━┓ ┗━━┓┃┗┓┃┃┃ ┏┛┃┗┓┗┓┗┓┃┗━━┓┃┏┛┗┛┏━┛┗┛┏┓┃┏┓┃┏━━┓┏┛┏━┛┃┃┏━━┓┃┃┏┛┃┃┃┃┗┓┃┃┃┃┏┓┗┓┃┃┏┛┏┓┏┛┗┛┏┛┏┛┏━┓┏┓┗┛┏━┓┏┓┏━┛┃┃┗┛┃┃┏┛┗┓ 
        ┏┓┏━━┛┏━━┓┗━┛┗┛┏┛┏┓┏━┛┃ ┗┛┃┗┓┗┓┗┓┗┓┗┓┃┗┓┏┓┃┗┛┏┓┏┛ ┏┓ ┃┃┃┃┗┛┗━┓┃┗┓┃┏┓┃┃┗┓┏┛┃┃┃┏┛┃┃┗┓┃┃┃┃┃┃┃ ┃┗┛┃ ┃┗┛┏━━┛┏┛┏┛┏┛┃┗┓┏┛ ┗┛┃┗━┓┃┗━┓┗┛┗━┓┃ 
        ┃┃┗━┓┏┛┏━┛┏━┓┏┓┗┓┃┃┗━━┛┏┓ ┗┓┃┏┛┏┛ ┗┓┗┛┏┛┃┃┃┏┓┃┗┛┏┓┃┗━┛┃┃┗┓┏┓┏┛┗┓┃┃┃┃┃┃┏┛┗┓┃┃┃┗┓┃┗┓┃┃┃┃┃┗┛┗┓┃┏┓┗┓┃┏━┛┏━━┛┏┛ ┗┓┗┓┃┗┓┏┓ ┃┏┓┃┗━┓┗┓   ┃┃ 
       ┏┛┗┓┏┛┗┓┗━━┛ ┗┛┗┓┗┛┗━━━━┛┃┏━┛┃┗┓┃ ┏┓┃┏━┛ ┃┃┗┛┃┃┏┓┃┃┗━┓┏┛┃┏┛┃┃┗━┓┃┃┃┃┃┃┃┗┓┏┛┃┃┃┏┛┃┏┛┃┃┃┃┃┏━━┛┗┛┃┏┛┃┗━━┛┏┓┏┛ ┏┓┗━┛┗━┛┃┗┓┗┛┃┗━┓┗━┛   ┗┛ 
       ┗━┓┗┛┏━┛ ┏━┓┏┓┏━┛┏━━┓┏┓┏┓┗┛┏┓┗┓┃┗┓┃┃┃┃┏┓┏┛┗┓┏┛┃┃┗┛┃┏┓┃┃┏┛┗┓┃┃┏┓┃┃┃┃┃┃┃┗┓┃┗┓┃┃┃┃┏┛┃┏┛┗┛┃┃┗━┓┏┓┏┛┗┓┃┏━━┓┃┃┃┏┓┃┗━━┓┏┓ ┃┏┛┏┓┗━━┛ ┏┓      
         ┃┏┓┃ ┏┓┗┓┃┃┗┛┏┓┗━┓┗┛┗┛┗━━┛┗┓┃┗┓┗┛┃┃┃┃┃┗┓┏┛┗┓┃┗┓ ┃┃┃┃┃┗━┓┃┃┃┃┃┃┃┃┃┃┃┃┏┛┃ ┃┃┃┃┃┗┓┃┗┓┏━┛┗━┓┃┃┗┛┏┓┗┛┗━┓┗┛┗┛┃┃┗━┓┏┛┃┗━┛┗┓┃┃┏┓┏┓ ┃┃      
         ┃┃┗┛┏┛┗┓┃┃┗━━┛┗━━┛┏━━━┓┏┓┏━┛┗━┛┏┓┃┃┗┛┗┓┃┗┓┏┛┗┓┃┏┛┃┃┃┗┓┏┛┃┃┃┃┃┃┃┃┃┃┃┃┗┓┗┓┃┃┃┃┃┏┛┗┓┃┗━┓┏┓┃┗┛┏┓┃┃┏━━━┛┏━━━┛┗┓┏┛┗┓┃┏━━━┛┃┗┛┗┛┗━┛┃      
         ┃┃ ┏┛┏┓┗┛┗━━━━━━━━┛┏━┓┗┛┃┗━━━┓┏┛┃┃┗┓┏┓┃┗┓┃┗┓ ┗┛┃┏┛┃┃┏┛┃┏┛┃┗┛┗┛┗┛┗┛┃┗┓┗┓┃┃┃┃┃┃┃┏━┛┃┏━┛┃┗┛┏━┛┗┛┃┗━━━┓┃┏━━━━┛┗┓┏┛┃┗━━━━┛┏┓┏━━━━┛      
         ┃┗┓┗━┛┗┓┏┓┏┓┏━━┓┏━┓┃┏┛┏┓┗━━━┓┗┛┏┛┗┓┗┛┃┗┓┃┗┓┃┏━━┛┗┓┃┃┗┓┃┗┓┗━━━━━━━┓┃┏┛┏┛┃┃┃┃┃┃┃┗━━┛┗━┓┗━┓┗━━━┓┗━━━┓┗┛┗━━━┓┏━┛┗━┛┏━━━━┓┃┃┗━━┓        
       ┏┓┗━┛ ┏━┓┃┃┃┃┃┃┏━┛┃┏┛┃┗━┛┃┏━━┓┗┓┏┛ ┏┛┏┓┃┏┛┗┓┗┛┃┏┓┏━┛┃┃┏┛┃┏┛┏┓┏┓┏┓┏━┛┃┗┓┃┏┛┗┛┃┃┃┃ ┏━━━━┛┏┓┗┓┏━━┛┏┓┏┓┗━━┓┏┓┏┛┗┓┏┓┏┓┗━┓┏┓┗┛┗━━━┛        
       ┃┗━┓┏┓┗┓┗┛┃┃┃┃┃┗┓┏┛┃┏┛┏━━┛┃┏━┛ ┗┛┏┓┃┏┛┃┃┗┓┏┛┏━┛┃┗┛┏━┛┃┗┓┃┗┓┃┃┃┃┃┃┗┓┏┛┏┛┃┗━┓ ┃┃┃┗┓┃┏━┓┏┓┃┃┏┛┃┏━┓┃┗┛┗━━┓┗┛┗┛┏┓┃┃┗┛┗━┓┗┛┗━┓┏┓┏━┓        
       ┗━┓┗┛┗━┛┏┓┃┃┃┃┗┓┃┃┏┛┃ ┗━━━┛┗━━━━━┛┃┃┗┓┗┛ ┃┗┓┗┓┏┛ ┏┛┏┓┗┓┗┛ ┗┛┃┃┃┃┗━┛┃┏┛┏┛┏┓┗┓┃┃┗┓┃┃┃┏┛┃┃┃┗┛ ┃┗┓┃┃┏━━━━┛┏┓ ┏┛┗┛┗┓ ┏┓┗━┓┏━┛┃┃┗┓┗┓       
         ┗━┓┏┓┏┛┃┃┃┃┃┏┛┗┛┗━┛┏━━━┓┏┓┏━━┓┏┓┃┗┓┃ ┏━┛┏┛┏┛┗━┓┗┓┃┃┏┛ ┏━━━┛┃┃┗━━┓┃┗┓┃┏┛┗┓┃┃┃ ┗┛┗┛┗┓┃┃┃┏━━┛┏┛┗┛┗━━━━━┛┗━┛┏┓┏┓┗━┛┗━┓┗┛┏┓┃┃┏┛┏┛       
           ┗┛┃┃┏┛┃┃┃┗┛┏┓┏━━━┛┏━┓┗┛┃┗━┓┗┛┃┗┓┃┗┓┗┓┏┛ ┗┓┏━┛ ┗┛┃┗┓┏┛┏━┓┏┛┃┏┓┏┛┃┏┛┃┗━┓┃┃┗┛┏┓┏┓┏━┛┃┃┃┃┏━┓┗┓┏━┓ ┏┓┏┓┏┓┏┓┃┗┛┃┏━┓┏┓┗━━┛┗┛┗┛┏┛        
             ┗┛┗━┛┗┛ ┏┛┃┗━━┓┏┛ ┗━┓┗━┓┗━┓┗━┛┗┓┃ ┗┛ ┏━┛┗━━┓┏━┛┏┛┃┏┛ ┃┗┓┃┃┗┛┏┛┗┓┗┓┏┛┗┛┏━┛┗┛┗┛┏━┛┃┃┗┛ ┗━┛┗┓┗━┛┗┛┗┛┃┃┃┃┏┓┗┛ ┃┃┃┏━┓┏┓┏┓┏┛         
           ┏┓ ┏━┓┏┓┏┓┗┓┃┏━━┛┃┏━┓ ┗━┓┃┏┓┃┏━┓ ┗┛┏┓┏┓┃┏━┓┏┓┃┗━┓┃┏┛┗┓┏┛┏┛┃┗━┓┗┓┏┛┏┛┗━━┓┃┏┓┏━━┓┃┏┓┗┛ ┏┓┏┓┏┓┗━━┓┏━━┓┗┛┗┛┃┗━━┓┃┃┗┛┏┛┃┃┃┃┗┓ ┏┓      
      ┏━━━┓┃┃ ┗┓┗┛┗┛┗┓┃┃┗━━━┛┗┓┗━━━┛┗┛┗┛┃┏┛┏┓┏┛┗┛┃┃┃┏┛┃┃┗┓┏┛┃┗┓┏┛┗┓┗┓┃┏┓┗┓┃┗┓┗┓┏━━┛┃┃┃┃┏━┛┃┃┗━━┓┃┗┛┃┃┃┏┓ ┗┛┏┓┃┏━━━┛┏━━┛┗┛┏┓┃┏┛┗┛┗┓┗━┛┃      
      ┗┓┏┓┗┛┗┓ ┗━━━━┓┗┛┃ ┏┓ ┏┓┗━━━━━━━━┓┃┗━┛┗┛┏━━┛┗┛┗┓┃┗━┛┗┓┃┏┛┗━┓┃┏┛┃┃┃┏┛┗┓┗┓┃┗┓┏┓┗┛┗┛┗━━┛┗━━┓┃┗━┓┗┛┗┛┗┓┏━┛┗┛┃┏━━━┛┏━━━━┛┃┗┛┏┓┏┓┗━┓┏┛      
       ┗┛┗┓┏━┛┏━┓┏━━┛┏━┛┏┛┃┏┛┗━━━━━━━━┓┗┛┏━━┓┏┛┏━━━┓┏┛┃┏━━━┛┃┗┓┏┓┃┃┗┓┃┃┗┛┏━┛┏┛┗┓┗┛┗┓┏━━━━━━━━━┛┃┏┓┗━┓┏━┓┃┗━━━━┛┗━━━━┛┏┓┏━━┛┏┓┃┗┛┗┓ ┗┛       
      ┏━━━┛┃┏┓┗┓┃┗━━┓┗━┓┗┓┃┗━━━━━━━━━┓┗S┓┗━┓┗┛ ┃┏━━┛┗━┛┗━┓┏┓┃┏┛┃┃┃┃┏┛┃┗━┓┗━┓┗━┓┃┏┓┏┛┗━━┓┏┓┏━━━┓┗┛┃┏━┛┃┏┛┗━┓┏━━┓┏━┓┏━┓┃┃┗━━━┛┗┛┏━┓┃          
      ┗┓┏━┓┃┃┃┏┛┃ ┏┓┗━┓┗┓┃┗━━┓ ┏━━━━┓┗━┓┗━━┛┏┓┏┛┗━━━━━┓┏┓┗┛┃┃┃┏┛┃┃┃┗┓┗━┓┃┏━┛┏┓┃┃┃┃┃  ┏┓┗┛┗┛┏━━┛┏┓┗┛┏┓┃┃┏━┓┗┛┏┓┃┗┓┃┗┓┃┃┃┏┓┏━━━┓┃ ┗┛          
       ┗┛┏┛┗┛┗┛┏┛┏┛┗━┓┃┏┛┗━━┓┗┓┗━━━┓┗━━┛┏┓ ┏┛┗┛┏━┓┏━━┓┗┛┃ ┏┛┃┃┃┏┛┃┃┏┛┏━┛┃┗━━┛┃┃┗┛┃┗━┓┃┗━━┓┏┛┏┓┏┛┃┏┓┃┗┛┗┛┏┛┏┓┃┃┗━┛┗┓┃┗┛┃┃┗┛┏━┓┃┗━━┓          
       ┏━┛┏━━━┓┃ ┗━━┓┗┛┃┏┓┏┓┗┓┃ ┏━┓┗━━━┓┃┗━┛┏┓┏┛ ┗┛┏┓┗━┓┃┏┛┏┛┃┃┗┓┃┗┛ ┗━┓┗━━┓┏┛┗━┓┃┏┓┃┗┓┏┓┗┛┏┛┗┛ ┃┃┃┗┓┏━┓┗━┛┗┛┃ ┏━┓┃┗━┓┃┗┓ ┃┏┛┗━━━┛          
       ┗━━┛┏┓ ┃┃┏━━┓┗━┓┃┃┗┛┗┓┃┃┏┛┏┛┏━━━┛┃┏━━┛┗┛┏┓┏┓┃┗┓ ┗┛┗┓┗┓┃┃┏┛┗━━━━┓┗┓┏┓┃┗┓┏━┛┃┃┗┛ ┗┛┗┓┏┛┏┓┏┓┗┛┗━┛┗┓┃┏━━━━┛┏┛┏┛┗┓┏┛┗┓┗━┛┗━━━━┓           
        ┏━━┛┗━┛┃┃┏┓┗━━┛┃┗━━┓┗┛┃┗┓┃ ┗━━━━┛┗━━━━━┛┗┛┗┛┏┛┏━━┓┗┓┃┃┃┗┓┏┓┏━┓┗┓┃┃┃┗┓┗┛  ┗┛┏━┓┏━━┛┗┓┃┗┛┗┓┏┓┏┓ ┃┃┗━┓┏┓ ┃┏┛┏┓┗┛┏┓┗┓┏━━┓┏━━┛           
      ┏━┛┏━━━━┓┃┗┛┗━┓┏┓┗━━━┛┏┓┗┓┃┗┓┏┓┏┓┏┓┏┓┏━┓┏━━━━━┛┏┛┏━┛┏┛┃┃┃┏┛┃┃┃ ┃┏┛┗┛┗┓┗━┓    ┗┓┗┛┏━━━┛┗┓┏┓┗┛┗┛┗━┛┗━━┛┃┗┓┃┃ ┃┃┏━┛┗┓┃┗━┓┗┛              
      ┗━┓┃ ┏━━┛┗┓┏┓ ┗┛┃┏┓┏━━┛┗┓┃┃┏┛┃┃┃┃┃┃┃┃┗┓┗┛┏┓┏┓┏┓┗┓┗━┓┗┓┃┗┛┃┏┛┗┛┏┛┗┓ ┏━┛┏━┛  ┏┓ ┗━━┛┏━━┓ ┗┛┃┏━┓┏┓┏┓┏━┓ ┗┓┗┛┗┓┃┗┛┏┓┏┛┗┓┏┛┏━┓             
        ┗┛ ┗━━━┓┃┃┃┏┓ ┗┛┃┃┏━━━┛┗┛┗━┛┗┛┗┛┃┃┗┓┗━━┛┗┛┗┛┗━┛┏━┛ ┗┛┏┓┃┗━┓ ┗━┓┃┏┛┏┓┃    ┃┃ ┏┓┏━┛┏┓┗━━━┛┗┓┗┛┃┃┃┃┏┛┏┓┃┏━━┛┗┓┏┛┃┗┓ ┃┗━┛┏┛             
           ┏━━━┛┗┛┗┛┗━━━┛┃┗━━━━┓┏┓┏┓┏━━┓┗┛ ┗━┓┏━━━━━━━┓┗┓   ┏┛┗┛┏━┛   ┗┛┗━┛┗┛    ┃┗━┛┃┗━━┛┗━━━┓┏━┛┏━┛┃┗┛┗━┛┗┛┗━━━━┛┗┓┗┓┗┓┗━━┓┃┏┓            
           ┗━━━━┓┏┓┏━━━━┓┃ ┏┓┏━┛┃┃┃┃┃┏━┛┏━━━┓┗┛ ┏━━━━┓┗┓┗┓  ┗━━┓┗┓              ┏┛┏━┓┗┓ ┏━┓┏━━┛┗┓┏┛┏┓┃┏━━━┓┏┓┏┓┏┓┏━━┛ ┗━┛┏━┓┃┗┛┗┓           
          ┏━━━━━┛┃┃┃┏┓┏┓┗┛┏┛┗┛┏┓┃┃┃┗┛┗━━┛┏━━┛ ┏┓┃┏━━┓┗┓┗━┛┏┓   ┃┏┛              ┗━┛ ┗┓┗┓┗┓┃┗━━┓┏┛┗━┛┗┛┗━━┓┗┛┗┛┃┃┃┗━━━━━━━┛┏┛┗━━━┛           
          ┗━━━┓┏┓┃┃┃┃┗┛┗┓ ┗┓┏━┛┗┛┗┛┏┓┏┓┏┓┗┓┏┓┏┛┗┛┗┓ ┗━┛ ┏┓┃┗┓  ┗┛             ┏━┓┏┓┏┓┗┓┗━┛┃ ┏┓┗┛ ┏━┓┏┓ ┏┓┗━━┓ ┗┛┗━━━┓┏━━━━┛ ┏┓┏━━┓          
          ┏┓┏┓┃┃┗┛┃┃┗┓┏┓┗━━┛┃┏━━━━━┛┗┛┗┛┗┓┗┛┗┛┏━━┓┗┓ ┏━┓┃┃┗┓┃                 ┗┓┃┃┃┃┃ ┃┏━┓┗━┛┗━━┓┗┓┗┛┗━┛┃┏━┓┗┓┏┓┏┓┏┓┗┛┏┓┏┓┏┓┃┃┗┓┏┛          
          ┃┗┛┃┗┛┏┓┗┛ ┗┛┗┓┏━━┛┗━━━━━━━━┓┏┓┃┏┓┏┓┗━┓┗┓┗┓┗┓┗┛┗━┛┗┓             ┏━━━┛┗┛┗┛┗━┛┃ ┗┓┏━━━┓┗┓┗━━━━┓┗┛ ┗┓┗┛┃┃┗┛┃┏┓┃┃┃┃┃┃┃┗━┛┗━┓┏┓       
          ┗━┓┃┏━┛┃┏┓ ┏┓┏┛┃┏━━┓┏┓┏━━━━┓┗┛┃┃┃┗┛┃┏┓┗┓┗┓┗━┛┏┓┏┓┏┓┃             ┗━━━┓┏━┓┏━┓┏┛┏┓┗┛┏┓┏┛┏┛ ┏━━┓┗━━━┓┃┏┓┗┛┏━┛┃┃┃┗┛┗┛┗┛┏━━━┓┗┛┃       
          ┏━┛┗┛┏┓┗┛┃┏┛┃┃┏┛┃┏┓┗┛┗┛┏━━┓┃┏━┛┃┗━┓┃┃┗┓┃┏┛┏┓┏┛┗┛┗┛┗┛                ┏┛┗┓┗┛ ┗┛ ┃┗━┓┃┃┗┓┃┏┓┗┓┏┛┏━━━┛┗┛┃┏┓┃┏┓┃┃┃┏━━┓┏━┛┏━┓┗━━┛       
          ┗━━━━┛┗┓┏┛┗┓┃┗┛ ┗┛┗━━┓┏┛ ┏┛┃┗━┓┗┓┏┛┗┛ ┃┃┗┓┃┃┗━┓┏┓┏┓                ┏┛┏━┛ ┏━━━┓┗━┓┗┛┗┓┃┃┃┃ ┃┗┓┗━━━━━┓┃┃┃┗┛┃┃┃┃┗━┓┗┛┏━┛┏┛ ┏┓        
           ┏┓┏┓┏┓┃┃ ┏┛┃┏┓┏┓┏━━━┛┃┏━┛ ┗━━┛ ┗┛┏┓┏┓┗┛ ┗┛┃┏┓┗┛┗┛┗┓               ┃┏┛   ┗━━┓┃┏┓┗━━┓┗┛┗┛┗━┛┏┛┏━━━━━┛┃┃┃┏━┛┃┃┗┓┏┛┏┓┗┓┏┛┏┓┃┗┓┏┓     
          ┏┛┗┛┗┛┗┛┗┓┗┓┃┃┃┃┗┛┏┓┏━┛┗━┓ ┏━┓┏┓┏┓┃┃┃┃┏┓┏━┓┗┛┗━━━┓┏┛               ┗┛ ┏┓ ┏┓┏┛┗┛┗━━━┛┏┓┏┓┏━┓┃ ┗━━━┓┏┓┗┛┗┛┏┓┃┗━┛┗━┛┗┓┃┃ ┃┃┃┏┛┃┗┓    
     ┏━━━━┛┏━━┓┏━━┓┗┓┃┃┃┃┗━━┛┗┛┏━━━┛┏┛┏┛┃┃┃┗┛┗┛┗┛┃┃┏┛ ┏━┓┏┓┗┛                  ┏┛┗┓┃┃┗┓┏━┓┏┓┏┓┃┃┃┗┛┏┛┃┏┓┏━┓┗┛┗┓┏┓┏┛┗┛┏┓┏━━━━┛┃┗━┛┗┛┗┓┗┓┗┓   
     ┗━━━━┓┗━┓┗┛┏━┛┏┛┃┃┃┃┏┓┏━━┓┗━━━━┛┏┛ ┃┃┗┓┏━━━━┛┃┃┏┓┗┓┃┃┗┓┏┓                ┏┛┏┓┗┛┗┓┗┛ ┗┛┗┛┗┛┃┗┓ ┗┓┃┃┃┗┓┃┏━━┛┃┃┃┏━━┛┃┗━━━━━┛┏━━━━┓┗━┛┏┛   
     ┏━━━━┛┏━┛┏┓┗━┓┗━┛┗┛┗┛┃┗━┓┃ ┏━┓┏━┛┏┓┃┃┏┛┗━━━┓ ┃┗┛┃ ┃┃┃┏┛┃┃ ┏┓             ┗━┛┃┏━┓┃┏┓┏┓┏┓┏━━┛┏┛┏┓┃┃┃┃ ┃┃┗━━━┛┗┛┗━┓ ┗━┓┏━━┓┏┛┏━━┓┗━┓┏┛    
     ┗━━━━┓┃┏━┛┃┏━┛┏┓┏━┓┏┓┗━━┛┗┓┗┓┃┗━━┛┗┛┗┛┏━━━━┛┏┛┏┓┃┏┛┃┃┃ ┃┗┓┃┗┓              ┏┛┃┏┛┗┛┗┛┗┛┃┗━━━┛┏┛┗┛┗┛┗━┛┃┏━━━┓┏┓┏┓┗━━┓┃┗━┓┃┗━┛┏┓┗━┓┃┗━┓┏┓ 
          ┃┃┃┏┓┗┛┏┓┃┃┗┓┗┛┗━━━━┓┗━┛┃┏━━━━━━━┛┏┓ ┏┓┗┓┃┗┛┗┓┗┛┗━┛┏┛┃┏┛            ┏━┛┏┛┗━┓┏┓┏━┓┗━━━━┓┗━━━┓┏┓┏┓┗┛┏┓ ┃┃┗┛┗━━━┛┗━━┛┃┏━┓┃┗┓┏┛┃┏┓┗┛┃ 
          ┗┛┗┛┗━━┛┗┛┃┏┛┏┓ ┏┓┏┓┗━━┓┗┛ ┏━━━━━━┛┗━┛┗┓┃┗┓┏┓┃┏━━━━┛┏┛┗┓            ┗┓┏┛┏━┓┗┛┗┛┏┛┏┓┏━┓┗━━━━┛┃┗┛┗━┓┃┗┓┗┛┏┓┏┓┏┓ ┏━━┓┃┗┓┃┃ ┃┃ ┃┃┃┏━┛ 
          ┏━━━┓┏━━━━┛┃┏┛┗━┛┗┛┗━━━┛┏┓┏┛┏┓┏┓┏━┓┏┓┏┓┗┛┏┛┃┃┃┃ ┏┓┏━┛┏━┛┏┓           ┗┛ ┗┓┗━━━┓┗━┛┗┛ ┗━━━┓┏┓┃┏━━━┛┗┓┃ ┏┛┃┃┃┃┗━┛┏┓┃┃┏┛┗┛┏┛┗┓┃┃┃┗┓  
          ┗━┓┏┛┗━┓┏━━┛┗━┓┏┓┏━━━┓┏━┛┗┛┏┛┗┛┃┗┓┃┃┃┃┃┏┓┃┏┛┗┛┗┓┃┃┃┏━┛┏━┛┃ ┏┓          ┏┓┗━━━┓┗━━┓┏━━━━━━┛┃┃┃┗━━━━━┛┗┓┗┓┃┃┗┛┏━━┛┗┛┗┛┏┓ ┗┓┏┛┃┃┗┓┃  
        ┏━━━┛┗━━┓┗┛┏━━━┓┗┛┃┃┏━━┛┃┏━━━┛ ┏┓┃┏┛┃┃┃┃┃┃┃┗┛┏┓┏┓┗┛┃┃┗━━┛┏━┛ ┃┃         ┏┛┗┓ ┏┓┗━┓┏┛┃┏━┓┏━┓┏┛┗┛┏━━━┓┏━┓┗━┛┗┛┏┓┃┏┓┏┓┏━━┛┗━┓┃┃ ┗┛ ┗┛  
        ┗┓┏┓┏━┓┏┛┏┓┗━━┓┃┏┓┗┛┗━┓┏┛┗━┓┏━━┛┃┃┗┓┗┛┃┃┃┃┃┏┓┃┃┃┃┏┓┗┛┏━━┓┗━┓┏┛┃ ┏━┓ ┏┓ ┏┛┏┓┗┓┃┃┏━┛┗┓┗┛┏┛┃ ┗┛┏┓ ┗━━┓┃┗┓┃┏┓┏┓┏┛┃┗┛┗┛┗┛┏━┓┏┓┃┗┛        
         ┗┛┗┛┏┛┃┏┛┃┏┓┏┛┗┛┗┓┏┓┏┛┃┏━┓┗┛┏┓┏┛┗━┛┏┓┗┛┃┃┃┃┃┃┗┛┗┛┃┏┓┗━┓┗┓┏┛┃┏┛┏┛┏┛ ┃┗┓┗┓┃┗┓┗┛┃┗━┓┏┛┏┓┃┏┛┏━━┛┗━━━━┛┗━┛┗┛┃┃┃┃┏┛┏━━━━━┛ ┗┛┗┛  ┏━┓     
           ┏┓┗┓┃┗┓┃┃┃┗━━┓┏┛┃┗┛┏┛┗┓┗━━┛┗┛┏━━━┛┗━┓┗┛┗┛┃┗━━┓┏┛┃┗━━┛ ┗┛ ┃┗━┛┏┛┏━┛┏┛ ┗┛ ┗━┓┗┓ ┃┗━┛┃┗┛ ┗━━━━━━━━━━━━━┓┗┛┃┃┗┓┗━━━━┓┏━┓ ┏━┓ ┃┏┛     
         ┏━┛┗━┛┗━┛┃┃┃┏━━┛┗┓┗━━┛┏┓┗━━━━━━┛┏━━━━┓┗┓┏┓ ┗━━┓┃┗━┛┏┓ ┏━┓┏┓┗━━┓┃ ┗━┓┃┏━┓┏━━┓┗┓┗━┛┏━━┛┏┓┏┓┏━━━━━━━━━━━━┛┏┓┗┛ ┗┓┏┓┏┓┗┛┏┛┏┛┏┛┏┛┗┓     
         ┗━━━━━━━┓┗┛┃┗━━━┓┃ ┏┓┏┛┗━━━━━━━━┛┏┓┏┓┗━┛┃┗━┓┏┓┗┛┏┓ ┃┗┓┗┓┃┃┗┓┏━┛┗┓ ┏┛┃┗┓┃┗━┓┗━┛┏━┓┃ ┏━┛┗┛┗┛┏━┓┏━━━━━━━┓┏┛┗┓ ┏┓┗┛┃┃┃┏━┛┏┛┏┛┏┛┏━┛     
         ┏┓┏┓ ┏━━┛┏┓┗┓┏━━┛┗━┛┗┛┏━━━━━━┓ ┏┓┃┗┛┗┓┏━┛┏━┛┃┗┓┏┛┃┏┛┏┛┏┛┃┃┏┛┗━━┓┗┓┗┓┗┓┃┗┓ ┗━┓┏┛┏┛┗┓┗━━━━━━┛ ┗┛┏┓┏━━━━┛┃┏━┛┏┛┗━┓┗┛┃┃ ┏┛┏┛┏┛┏┛       
        ┏┛┗┛┗━┛┏┓┏┛┗┓┗┛┏┓┏━━━━━┛┏┓ ┏━┓┗━┛┗┛┏━┓┗┛┏┓┃┏┓┗┓┃┃┏┛┃┏┛┏┛┏┛┃┗┓ ┏┓┗┓┗┓┃┏┛┗┓┗┓┏┓┗┛ ┗┓┏┛┏━━┓┏┓ ┏┓ ┏┛┗┛ ┏┓┏┓┃┗┓┏┛┏━━┛┏┓┗┛┏┛┏┛ ┗┓┃┏┓      
        ┗━━━━┓┏┛┃┗━┓┗━━┛┃┃┏━━━━━┛┗━┛ ┗━━━━━┛┏┛┏━┛┗┛┃┗┓┃┗┛┗┓┃┗┓┗┓┗━┛┏┛┏┛┗━┛┏┛┃┗━┓┗┓┃┃┗━━┓┏┛┃ ┗━┓┗┛┗━┛┗━┛┏━━━┛┗┛┃┃┏┛┗┓┗━━━┛┗┓┏┛┏┛┏┓┏┛┗┛┗━┓    
         ┏━━━┛┗┓┗┓┏┛┏━━━┛┃┗┓┏┓┏━┓┏━┓┏━━┓┏┓┏┓┗━┛ ┏┓ ┃┏┛┗━┓┏┛┗┓┗┓┃┏┓┏┛ ┗┓┏━┓┗━┛┏━┛┏┛┗┛┏━━┛┗┓┗┓┏┓┗━━━━━┓┏┓┃┏━━┓┏┓┗┛┗━━┛┏┓┏━━━┛┗┓┃ ┃┗┛┏┓┏━━┛    
         ┃┏┓┏┓┏┛┏┛┃┏┛┏┓┏┓┃┏┛┃┗┛ ┗┛ ┗┛┏┓┗┛┗┛┗┓ ┏┓┃┗━┛┗━━┓┃┗━┓┗┓┃┃┃┗┛ ┏┓┃┃ ┗┓┏━┛┏┓┃┏━┓┗━━━┓┗┓┗┛┗━━━━━━┛┃┗┛┗━┓┃┃┃┏━━━━━┛┗┛┏┓┏┓┏┛┗━┛┏┓┃┃┗━┓     
         ┗┛┗┛┃┃┏┛┏┛┗┓┃┗┛┗┛┗━┛┏┓┏┓┏┓┏┓┃┃┏━┓┏┓┗━┛┗┛┏┓┏━━━┛┃┏━┛┏┛┗┛┗━━┓┃┃┗┛┏━┛┗━┓┃┃┗┛ ┗┓┏━━┛┏┛┏━━━┓┏┓┏┓┏┛┏━┓┏┛┗┛┃┗━━┓ ┏━━┓┃┗┛┃┃┏━━━┛┃┃┗━━┛     
       ┏━━━━┓┗┛┗━┛┏┓┗┛ ┏┓ ┏┓┏┛┗┛┗┛┗┛┗┛┃┃┏┛┃┃┏┓┏┓┏┛┗┛┏┓┏┓┃┃ ┏┛┏━━━━━┛┃┗┓┏┛┏┓┏━┛┃┗┓ ┏┓┃┃┏┓ ┃┏┛ ┏━┛┃┃┃┗┛ ┗┓┗┛┏━┓┗━━┓┗━┛┏━┛┗━┓┃┃┗━━┓ ┗┛┏┓ ┏┓    
       ┗━┓┏┓┃┏┓┏┓┏┛┗━━┓┃┃┏┛┃┗━━━━━━━━┓┃┃┃┏┛┗┛┗┛┗┛┏┓┏┛┃┃┃┃┗┓┃┏┛ ┏━━┓ ┃┏┛┗━┛┃┗┓ ┗┓┃┏┛┃┃┗┛┗┓┗┛┏┓┗━━┛┃┃┏━━━┛┏━┛┏┛ ┏┓┗━━━┛┏┓┏┓┃┗┛┏━━┛┏┓┏┛┗━┛┗━┓  
         ┗┛┃┗┛┗┛┃┗━━━┓┗┛┃┗┓┃┏━━┓┏━━━━┛┗┛┗┛┏━━━┓┏━┛┃┃┏┛┃┃┗┓┃┃┃┏┓┃┏━┛┏┛┗┓ ┏┓┗┓┃┏┓┃┃┗┓┃┗━━┓┗━━┛┃┏┓┏┓┗┛┗━━━━┛┏━┛ ┏┛┗━━━━━┛┗┛┗┛┏┓┗━┓┏┛┃┃┏━━━━━┛  
           ┗┓┏━┓┗━━━┓┗━┓┗━┛┃┗━┓┃┗━━━━━━┓┏━┛┏━━┛┗━┓┗┛┗┓┃┗━┛┃┃┗┛┃┃┗━┓┗┓┏┛┏┛┗━┛┗┛┃┃┗┓┃┗━━┓┗━┓┏┓┗┛┗┛┗┓┏┓┏┓ ┏━┛ ┏┓┃┏━┓┏━┓┏┓┏━┓┏┛┗━┓┗┛┏┛┃┃ ┏━━━┓  
          ┏┓┃┃ ┗┓┏━┓┗━┓┗┓┏┓┗━━┛┗━━━━━━━┛┃┏┓┗━━━┓┏┛┏━━┛┗━┓┏┛┗┓┏┛┃┏━┛┏┛┃ ┗━━━━┓┏┛┗┓┃┃┏━┓┃┏┓┗┛┃┏━┓┏┓┗┛┗┛┗┓┗━━━┛┗┛┗┓┗┛┏┛┃┃┃┏┛┗━━┓┗━┓┗━┛┗┓┃┏━━┛  
          ┃┃┗┛┏━┛┗┓┃┏┓┗┓┗┛┗┓┏┓┏┓┏┓┏┓ ┏┓ ┗┛┃┏━━━┛┗┓┃┏━┓┏━┛┗┓┏┛┃┏┛┃┏┓┗┓┗┓ ┏┓┏━┛┗━━┛┗┛┗┓┗┛┃┗━┓┃┗┓┗┛┗━━━┓┏┛┏┓┏━┓┏━┓┗━┓┗━┛┗┛┗┓┏━┓┃ ┏┛┏┓┏┓┗┛┗━━┓  
       ┏━┓┃┃┏┓┗━━━┛┗┛┗┓┗┓┏┓┃┃┗┛┗┛┗┛┃┏┛┗┓┏┓┃┗┓┏━┓┏┛┃┃┏┛┗━┓┏┛┗┓┃┗┓┃┃┃┏┛┏┛┏┛┃┃┏━━━━┓┏━━┛┏┓┗┓┏┛┗━┛┏┓ ┏━━┛┗━┛┗┛ ┗┛ ┃┏┓┗━┓ ┏━━┛┗┓┃┃┏┛┏┛┗┛┗┓┏━━┓┃  
    ┏━━┛┏┛┃┃┃┃┏┓┏┓ ┏┓ ┗┓┗┛┃┗┛┏┓┏┓┏┓┗┛┏┓┗┛┃┗┓┗┛┏┛┃┏┛┃┃┏┓ ┃┃┏┓┃┗━┛┃┃┗┛┏┛┏┛┏┛┗┛┏━━━┛┗━┓┏┛┃┏┛┗┓┏┓┏┛┗┓┗━┓┏┓┏┓┏━━━━┓┗┛┃┏┓┗┓┗┓┏━┓┃┗┛┗┓┗━━┓┏┛┗━┓┃┃  
    ┗━━┓┗━┛┃┃┃┃┃┃┗━┛┃┏━┛┏┓┗━━┛┗┛┗┛┗━━┛┗━━┛ ┗━┓┗━┛┗┓┃┃┃┗┓┃┗┛┃┗━━┓┃┃┏━┛┏┛┏┛ ┏┓┗┓┏┓┏┓┏┛┃┏┛┃┏━┛┃┗┛┏┓┃┏━┛┃┗┛┗┛┏┓┏━┛┏┓┃┃┃┏┛┏┛┗┓┃┗┓┏┓┃┏━┓┃┗━┓┏┛┗┛  
     ┏━┛┏━┓┃┃┃┃┃┗━━┓┃┗━━┛┗━━━━━┓┏━━━┓┏┓┏┓┏┓┏━┛┏━┓┏┛┃┃┃┏┛┗━┓┃┏┓┏┛┃┃┃┏┓┗┓┃┏┓┃┃ ┗┛┗┛┃┃┏┛┗┓┃┗━┓┃┏━┛┗┛┗━┓┃┏━━━┛┗┛┏┓┃┃┗┛┗┛ ┗┓┏┛┃┏┛┃┗┛┃ ┗┛┏━┛┃┏┓ ┏┓
     ┗━━┛┏┛┗┛┗┛┃ ┏┓┃┃┏┓┏━━━━━━┓┃┃┏━━┛┃┃┃┗┛┃┗━┓┃ ┗┛ ┃┃┃┃┏┓ ┃┃┃┃┃┏┛┃┃┃┃┏┛┃┃┃┃┃┏━┓┏━┛┗┛┏━┛┗━┓┗┛┗━━┓┏┓ ┗┛┗━━━━━━┛┗┛┗━┓┏┓┏┓┗┛ ┃┗┓┃┏┓┗┓  ┃┏┓┗┛┗━┛┃
       ┏━┛┏━━━┓┗━┛┗┛┗┛┃┗┓┏━┓┏┓┗┛┃┗━━━┛┗┛┏┓┃┏━┛┗┓┏┓┏┛┃┃┃┃┃┏┛┃┃┃┃┃┏┛┃┃┃┗┓┃┃┃┃┃┃┏┛┗━━━┓┃┏┓ ┏┛┏━━━┓┃┃┗━┓ ┏━━━━━━┓┏━━━┛┃┗┛┗┓ ┏┛┏┛┗┛┗┓┗━┓┗┛┗┓┏┓┏┓┃
      ┏┛┏┓┃┏━━┛┏━┓┏┓┏┓┗━┛┃ ┗┛┗┓┏┛┏┓┏┓┏━━┛┗┛┗━┓┏┛┃┃┗┓┃┃┃┃┃┗┓┗┛┃┃┗┛┏┛┃┃┏┛┃┃┃┃┃┃┗━┓┏┓ ┃┗┛┃┏┛┏┛┏┓ ┗┛┗━┓┗┓┃┏┓┏━━┓┗┛┏━━━┛┏━┓┗┓┃┏┛┏━━━┛┏┓┗━━┓┃┃┃┃┃┃
      ┃┏┛┗┛┗┓┏┓┗┓┗┛┗┛┃┏━━┛┏┓┏┓┗┛┏┛┗┛┃┃┏┓┏┓┏┓┏┛┗┓┃┃┏┛┃┃┃┃┃ ┗━┓┃┃┏━┛┏┛┃┃┏┛┃┃┃┗┛┏┓┃┃┃┏┛┏━┛┃┏┛ ┃┗━┓┏┓┏┛┏┛┗┛┗┛┏━┛┏┓┃┏━━┓┗┓┃┏┛┃┃ ┗━━┓┏┛┃┏┓┏┛┃┃┗┛┃┃
      ┗┛  ┏━┛┃┗┓┃┏┓┏━┛┃┏━┓┃┗┛┗━━┛┏━┓┗┛┃┃┃┃┃┃┗┓┏┛┃┃┃┏┛┃┃┃┃┏┓ ┃┃┃┃┏┓┗┓┃┃┃ ┃┃┗┓┏┛┗┛┃┃┗┓┃┏┓┃┃┏┓┗┓┏┛┃┃┃┏┛┏┓ ┏┓┗━━┛┗┛┗━┓┗━┛┗┛┏┛┗━┓ ┏┛┃ ┃┃┗┛┏┛┃  ┃┃
      ┏━━━┛┏┓┃ ┗┛┃┃┗━━┛┗┓┃┗━━━┓┏┓┃ ┗┓┏┛┃┃┃┃┗┓┃┗┓┃┃┃┗┓┃┗┛┃┃┗┓┃┃┃┃┃┗┓┃┗┛┗━┛┗┓┃┃┏┓┏┛┃┏┛┗┛┃┃┃┃┗┓┃┃┏┛┃┃┃┏┛┃┏┛┗┓┏━┓┏┓┏┓┗━━━━┓┗━━┓┃┏┛┏┛┏┛┗━┓┗━┛  ┗┛
      ┃┏━━┓┃┃┃┏━━┛┗━━━┓┏┛┃┏┓┏┓┗┛┃┗━┓┃┗┓┃┃┃┃┏┛┃┏┛┃┃┗┓┃┗━┓┃┃┏┛┃┗┛┃┗┓┃┗┓┏━━┓ ┃┃┗┛┃┗┓┗┛┏┓┏┛┃┃┗┓┃┃┗┛┏┛┃┃┗┓┃┃┏━┛┗┓┃┃┗┛┗━━┓┏┓┗┓┏┓┗┛┗┓┗┓┗━━┓┃       
      ┗┛  ┗┛┗┛┃┏━━━━━┓┃┗┓┗┛┗┛┗━━┛┏┓┃┃┏┛┃┃┃┃┃┏┛┗┓┃┗┓┃┃┏━┛┃┃┗┓┗┓ ┃┏┛┗┓┃┃┏┓┗━┛┗━┓┗┓┗━━┛┃┗┓┃┗┓┃┃┗━┓┃┏┛┗┓┃┗┛┗━┓┏┛┃┗━━┓┏┓┗┛┗━┛┃┗┓  ┗━┛   ┗┛       
          ┏┓┏┓┃┗┓┏━━━┛┃ ┃┏┓┏┓┏━┓┏┛┃┃┃┃┏┛┃┃┃┃┗━┓┃┗┓┃┃┃┗━┓┗┛┏┛┏┛┏┛┗━┓┗┛┗┛┃┏┓┏┓┏┛ ┃┏━━━┛┏┛┗┓┃┃┃┏┓┃┃┃ ┏┛┗┓┏┓┏┛┃ ┃┏━┓┗┛┗┓┏┓┏┓┃┏┛                 
          ┃┗┛┗┛┏┛┗━━━┓┗━┛┃┃┃┃┃┏┛┗┓┗┛┗┛┃┏┛┃┃┗┓┏┛┗┓┃┃┃┗┓┏┛┏┓┗┓┗┓┗┓┏┓┃┏━━━┛┃┃┃┃┗┓┏┛┗━━┓ ┗┓┏┛┃┃┃┃┗┛┗┛┏┛┏┓┗┛┃┗┓┃┏┛┗┓┃┏┓┏┛┃┗┛┗┛┗━━┓               
          ┗━┓┏━┛┏━━━━┛┏┓┏┛┃┃┃┃┗┓┏┛┏━━┓┗┛ ┗┛┏┛┃┏━┛┃┃┗┓┃┃┏┛┗━┛┏┛ ┃┃┃┃┗━┓┏┓┃┗┛┃┏┛┗┓┏━━┛┏━┛┃ ┗┛┃┗━━━┓┃┏┛┃┏┓┗┓┃┃┗┓┏┛┗┛┃┃ ┃┏━━━━┓┏┛               
           ┏┛┃┏┓┗━━┓┏┓┃┃┃ ┗┛┃┃┏┛┗━┛┏┓┗━━━┓ ┗┓┃┃┏┓┃┗┓┃┃┃┗━┓┏┓┃┏━┛┃┃┃┏━┛┃┃┗━┓┃┗┓ ┃┗━┓ ┗━━┛┏━━┛┏━━━┛┗┛ ┃┃┃┏┛┗┛ ┃┗━┓┏┛┗┓┃┃┏━━┓┃┃                
           ┗━┛┃┃┏┓┏┛┃┃┃┃┗━━┓┗┛┗━━┓┏┛┗━━┓┏┛┏┓┗┛┗┛┃┗┓┃┃┃┃┏━┛┃┃┃┗┓┏┛┃┃┗━┓┃┗━┓┃┃┏┛┏┛┏┓┗┓ ┏━┓┗┓┏┓┗━┓ ┏━━━┛┃┃┃  ┏━┛┏━┛┗━┓┗┛┗┛┏━┛┗┛                
           ┏━━┛┗┛┗┛┏┛┃┃┃┏━━┛┏┓┏━━┛┗━━━┓┃┗┓┃┗━━━━┛┏┛┃┃┗┛┃┏┓┃┃┃ ┃┃ ┃┃┏━┛┃┏┓┃┃┃┗┓┃┏┛┗┓┃┏┛┏┛ ┗┛┃┏┓┃┏┛┏┓┏┓┃┃┗┓┏┛┏┓┗━━━┓┃┏━┓┏┛┏┓                  
           ┗━━━┓┏━┓┗┓┗┛┃┗┓┏━┛┗┛┏┓┏┓┏━━┛┗┓┃┃┏┓┏┓┏┓┗┓┃┗━┓┃┃┗┛┃┗┓┃┗┓┃┃┗━━┛┃┗┛┃┗┓┃┃┗━┓┃┗┛┏┛ ┏┓┏┛┃┃┃┃┏┛┃┃┃┃┗━┛┗━┛┃┏━┓┏┛┗┛┏┛┗━┛┗┓                 
            ┏━━┛┗┓┗┓┃┏━┛┏┛┗━━┓┏┛┃┃┃┗━━━┓┃┃┗┛┗┛┃┃┃┏┛┃┏━┛┗┛┏━┛┏┛┃┏┛┃┃┏━━━┛┏┓┗┓┃┃┃┏┓┃┃┏┓┗━┓┃┗┛┏┛┃┃┃┗┓┃┃┃┗━━━━┓┏┛┗┓┃┗━━┓┗┓┏┓┏┓┗┓                
            ┗┓┏┓┏┛┏┛┃┗┓┏┛ ┏━━┛┃ ┗┛┃┏━┓┏┛┃┃┏━━━┛┃┃┃┏┛┗━┓┏┓┗━┓┗┓┃┃┏┛┃┗┓┏━┓┃┗┓┃┃┃┃┃┗┛┗┛┃┏━┛┗━┓┗┓┃┃┗┓┃┗┛┃┏━━━━┛┃┏━┛┃┏━┓┗┓┃┃┗┛┗━┛                
             ┗┛┗┛ ┗┓┗┓┗┛┏┓┗┓┏┓┗┓┏━┛┃ ┗┛┏┛┃┗━┓┏┓┃┃┃┗━┓┏┛┃┗━━┛┏┛┃┃┃┏┛ ┗┛┏┛┗┓┗┛┃┃┃┗━┓┏━┛┗━┓┏┓┗━┛┗┛┏┛┃┏━┛┃┏━━━━┛┗━┓┃┃┏┛┏┛┃┗━┓┏┓                 
          ┏━━━━━━━━┛┏┛┏━┛┗━┛┃┃┏┛┃┏┓┗━━┓┗━┛┏━┛┃┃┃┗┛┏━┛┗┓┗━━━┓┃ ┗┛┃┗━┓┏━┛┏┓┗━┓┗┛┃┏━┛┗━┓┏┓┗┛┗━━━┓ ┗┓┃┃┏━┛┗┓┏━┓┏┓┏┛┃┃┗━┛┏┛┏┓┗┛┗┓                
          ┗┓┏┓┏┓┏┓┏━┛┏┛┏━┓┏┓┃┃┗┓┗┛┃┏━━┛┏┓ ┗┓┏┛┗┛ ┏┛┏━┓┗━┓┏━┛┗━┓┏┛┏━┛┗━━┛┗┓┏┛ ┏┛┗━┓┏━┛┃┗━━━┓┏┓┗┓┏┛┃┃┗━┓┏┛┗┓┃┃┃┃┏┛┗━━┓┗┓┃┃┏━━┛                
           ┗┛┗┛┃┃┃┃┏━┛┏┛ ┗┛┃┃┃┏┛ ┏┛┗━━━┛┗┓ ┃┗━━┓┏┛┏┛ ┗┓┏┛┃┏┓┏━┛┗━┛┏━━━━━━┛┗━┓┗┓┏┓┃┗━┓┗━━┓ ┗┛┗━┛┗┓┃┃┏━┛┃┏┓┃┃┃┃┃┗━┓┏━┛┏┛┃┃┗━━━┓               
               ┗┛┃┃┗┓┏┛┏┓┏━┛┃┃┃┏━┛┏━━━━━━┛┏┛┏━┓┃┗┓┗━━┓┃┃┏┛┃┃┗━━━┓┏┛┏━┓┏┓┏┓┏━┛┏┛┃┃┃┏━┛┏━┓┗━━━┓┏━┓┗┛┃┃┏┓┗┛┃┃┗┛┃┃ ┏┛┗━┓┗━┛┃┏━━━┛               
                 ┗┛ ┃┃┏┛┗┛┏┓┃┗┛┃┏┓┗━━━┓┏┓┏┛┏┛┏┛┃┏┛┏━┓┃┃┃┗┓┃┗┓┏┓┏┛┗┓┃┏┛┃┗┛┃┗━┓┃┏┛┗┛┗┓┏┛┏┛┏━━━┛┗┓┗┓┏┛┗┛┗┓┏┛┃┏━┛┗┓┗┓┏┓┗━━┓┃┗━┓                 
                    ┗┛┗━━┓┃┗┛┏━┛┃┗┓┏━┓┗┛┃┗━┛ ┗━┛┗┓┃┏┛┃┃┃ ┃┗┓┃┃┃┗┓ ┃┃┗┓┃┏━┛┏┓┃┃┗┓┏━━┛┗┓┗┓┗━┓ ┏━┛┏┛┗┓┏┓┏┛┗━┛┗┓┏┓┃ ┗┛┃┏━━┛┗━━┛                 
                 ┏┓┏━━━━━┛┗┓┏┛┏┓┃┏┛┗┓┗━┓┗━━━┓┏━━━┛┃┗━┛┃┃┏┛┏┛┃┃┗━┛┏┛┃ ┗┛┗┓┏┛┗┛┗━┛┗┓┏━━┛ ┃┏━┛┏┛┏┓┗━┓┗┛┃┗━┓┏━━┛┃┃┗━━┓┃┗┓                       
                ┏┛┃┗━━━━━━┓┃┃┏┛┃┃┗┓┏┛ ┏┛┏┓┏┓┃┃┏━━┓┃ ┏━┛┃┗┓┗┓┃┃┏┓ ┗┓┃┏━━━┛┗━━┓ ┏━━┛┃┏━━━┛┗━━┛┏┛┃┏┓┗┓┏┛┏┓┃┃┏━┓┃┃┏┓┏┛┃┏┛                       
                ┗┓┗━━━━━━━┛┃┃┗┓┗┛┏┛┗━┓┗┓┃┗┛┃┃┃┃┏━┛┗┓┗━┓┗┓┃┏┛┃┗┛┃┏━┛┃┗━┓┏┓┏━┓┃┏┛┏┓┏┛┗━┓┏━┓┏┓┏┛ ┃┃┗┓┃┗┓┃┃┃┗┛┏┛┃┃┃┃┗┓┗┛                        
                 ┃┏━┓┏━━━┓┏┛┃┏┛ ┏┛┏┓┏┛┏┛┗┓ ┗┛┗┛┃┏━┓┃┏┓┃┏┛┃┗┓┃┏━┛┗━┓┃┏━┛┃┃┗┓┃┃┗━┛┃┃ ┏━┛┗┓┃┃┃┃┏┓┗┛ ┗┛ ┗┛┃┗━┓┗━┛┃┃┃┏┛                          
                 ┗┛┏┛┃ ┏━┛┃ ┃┗━┓┃┏┛┗┛┏┛┏┓┗━━┓┏━┛┗┓┃┃┃┗┛┗┓┗┓┃┃┗━┓  ┗┛┗┓┏┛┗┓┃┗┛ ┏━┛┗┓┗┓┏┓┃┃┃┃┗┛┗━━┓  ┏━━┛┏━┛  ┏┛┃┃┗┓                          
                   ┗━┛┏┛┏┓┃┏┛┏┓┃┃┗┓ ┏┛┏┛┃┏━━┛┗━┓┏┛┗┛┃┏━┓┗┓┃┃┗━━┛     ┃┃ ┏┛┃ ┏━┛┏┓┏┛ ┗┛┃┃┗┛┗┓┏━━━┛  ┗━━━┛    ┗━┛┗━┛                          
                      ┗┓┃┗┛┃┏┛┃┃┗┓┃┏┛┏┛┏┛┗━━┓┏━┛┃   ┃┃ ┃┏┛┃┗━━┓      ┗┛ ┗┓┃┏┛┏━┛┃┃┏┓ ┏┛┗┓┏━┛┗┓                                              
                     ┏━┛┃ ┏┛┃ ┗┛ ┃┃┗┓┃┏┛┏━┓┏┛┃┏┓┗━┓ ┗┛ ┃┃┏┛┏━┓┃          ┃┃┃┏┛┏━┛┗┛┗┓┃┏┓┃┗━┓┏┛                                              
                     ┗━━┛ ┗┓┃   ┏┛┃ ┗┛┃┏┛┏┛┃ ┗┛┃┏━┛  ┏━┛┃┗┓┃ ┗┛          ┗┛┗┛┏┛┏━┓┏━┛┗┛┃┃┏━┛┗┓                                              
                           ┗┛   ┗━┛   ┗┛ ┗┓┗┓  ┗┛    ┃┏┓┃ ┗┛                 ┗┓┃┏┛┗━━━┓┗┛┗━┓┏┛                                              
                                          ┗━┛       ┏┛┃┗┛                     ┗┛┗┓┏━━┓┃   ┏┛┃                                               
                                                    ┗━┛                          ┃┃  ┗┛   ┃┏┛                                               
                                                                                 ┃┃       ┗┛                                                
                                                                                 ┗┛                                                         
                                                                                                                                            

```

### Day 19 (for test input)
```mermaid
flowchart TD
qkq --> 1[x : 1..1415<br>m : 1..4000<br>a : 1..2005<br>s : 1..1350]
1 --> A
qkq --> 2[x : 1416..4000<br>m : 1..4000<br>a : 1..2005<br>s : 1..1350]
2 --> crn
crn --> 3[x : 2663..4000<br>m : 1..4000<br>a : 1..2005<br>s : 1..1350]
3 --> A
crn --> 4[x : 1416..2662<br>m : 1..4000<br>a : 1..2005<br>s : 1..1350]
4 --> R
px --> 5[x : 1..4000<br>m : 1..4000<br>a : 1..2005<br>s : 1..1350]
5 --> qkq
px --> 6[x : 1..4000<br>m : 2091..4000<br>a : 2006..4000<br>s : 1..1350]
6 --> A
px --> 7[x : 1..4000<br>m : 1..2090<br>a : 2006..4000<br>s : 1..1350]
7 --> rfg
gd --> 8[x : 1..4000<br>m : 1..2090<br>a : 3334..4000<br>s : 1..536]
8 --> R
gd --> 9[x : 1..4000<br>m : 1..2090<br>a : 2006..3333<br>s : 1..536]
9 --> R
rfg --> 10[x : 1..4000<br>m : 1..2090<br>a : 2006..4000<br>s : 1..536]
10 --> gd
rfg --> 11[x : 2441..4000<br>m : 1..2090<br>a : 2006..4000<br>s : 537..1350]
11 --> R
rfg --> 12[x : 1..2440<br>m : 1..2090<br>a : 2006..4000<br>s : 537..1350]
12 --> A
in --> 13[x : 1..4000<br>m : 1..4000<br>a : 1..4000<br>s : 1..1350]
13 --> px
in --> 14[x : 1..4000<br>m : 1..4000<br>a : 1..4000<br>s : 1351..4000]
14 --> qqz
qs --> 15[x : 1..4000<br>m : 1..4000<br>a : 1..4000<br>s : 3449..4000]
15 --> A
qs --> 16[x : 1..4000<br>m : 1..4000<br>a : 1..4000<br>s : 2771..3448]
16 --> lnx
lnx --> 17[x : 1..4000<br>m : 1549..4000<br>a : 1..4000<br>s : 2771..3448]
17 --> A
lnx --> 18[x : 1..4000<br>m : 1..1548<br>a : 1..4000<br>s : 2771..3448]
18 --> A
qqz --> 19[x : 1..4000<br>m : 1..4000<br>a : 1..4000<br>s : 2771..4000]
19 --> qs
hdj --> 20[x : 1..4000<br>m : 839..1800<br>a : 1..4000<br>s : 1351..2770]
20 --> A
hdj --> 21[x : 1..4000<br>m : 1..838<br>a : 1..4000<br>s : 1351..2770]
21 --> pv
pv --> 22[x : 1..4000<br>m : 1..838<br>a : 1717..4000<br>s : 1351..2770]
22 --> R
pv --> 23[x : 1..4000<br>m : 1..838<br>a : 1..1716<br>s : 1351..2770]
23 --> A
qqz --> 24[x : 1..4000<br>m : 1..1800<br>a : 1..4000<br>s : 1351..2770]
24 --> hdj
qqz --> 25[x : 1..4000<br>m : 1801..4000<br>a : 1..4000<br>s : 1351..2770]
25 --> R
```
### Day 20
```mermaid
flowchart TD
broadcaster -->|low 0| broadcaster
broadcaster -->|low 0| sr
broadcaster -->|low 0| gd
broadcaster -->|low 0| mg
broadcaster -->|low 0| hf
sr -->|high 0| cm
sr -->|high 0| ps
gd -->|high 0| ml
gd -->|high 0| rm
mg -->|high 0| mk
mg -->|high 0| kf
hf -->|high 0| kh
hf -->|high 0| jg
ps -->|high 0| xc
ps -->|high 0| mq
ps -->|high 0| jt
ps -->|high 0| zs
ps -->|high 0| sr
ps -->|high 0| nt
ps -->|high 0| pq
ml -->|high 0| bp
ml -->|high 0| gd
ml -->|high 0| qv
ml -->|high 0| kq
mk -->|high 0| kf
mk -->|high 0| qn
mk -->|high 0| nh
mk -->|high 0| pd
mk -->|high 0| dq
mk -->|high 0| mg
mk -->|high 0| bm
kh -->|high 0| jg
kh -->|high 0| qx
kh -->|high 0| md
kh -->|high 0| th
kh -->|high 0| hf
kh -->|high 0| dm
kh -->|high 0| kk
xc -->|low 0| zh
bp -->|low 0| zh
pd -->|low 0| zh
th -->|low 0| zh
zh -->|high 0| rx
sr -->|low 1| cm
sr -->|low 1| ps
gd -->|low 1| ml
gd -->|low 1| rm
mg -->|low 1| mk
mg -->|low 1| kf
hf -->|low 1| kh
hf -->|low 1| jg
cm -->|high 1| ps
cm -->|high 1| tm
rm -->|high 1| sl
rm -->|high 1| ml
kf -->|high 1| xt
jg -->|high 1| kk
cm -->|low 3| ps
cm -->|low 3| tm
rm -->|low 3| sl
rm -->|low 3| ml
kf -->|low 3| xt
jg -->|low 3| kk
tm -->|high 3| ps
tm -->|high 3| mq
sl -->|high 3| ml
sl -->|high 3| cp
xt -->|high 3| dq
xt -->|high 3| mk
kk -->|high 3| dm
tm -->|low 7| ps
tm -->|low 7| mq
sl -->|low 7| ml
sl -->|low 7| cp
xt -->|low 7| dq
xt -->|low 7| mk
kk -->|low 7| dm
mq -->|high 7| nt
cp -->|high 7| qv
cp -->|high 7| ml
dq -->|high 7| qn
dm -->|high 7| qx
mq -->|low 15| nt
cp -->|low 15| qv
cp -->|low 15| ml
dq -->|low 15| qn
dm -->|low 15| qx
nt -->|high 15| jt
qv -->|high 15| kv
qn -->|high 15| rr
qx -->|high 15| pp
nt -->|low 31| jt
qv -->|low 31| kv
qn -->|low 31| rr
qx -->|low 31| pp
jt -->|high 31| pq
kv -->|high 31| jn
kv -->|high 31| ml
rr -->|high 31| mk
rr -->|high 31| nh
pp -->|high 31| kh
pp -->|high 31| md
jt -->|low 63| pq
kv -->|low 63| jn
kv -->|low 63| ml
rr -->|low 63| mk
rr -->|low 63| nh
pp -->|low 63| kh
pp -->|low 63| md
pq -->|high 63| zs
jn -->|high 63| ll
jn -->|high 63| ml
nh -->|high 63| bm
md -->|high 63| hs
pq -->|low 127| zs
jn -->|low 127| ll
jn -->|low 127| ml
nh -->|low 127| bm
md -->|low 127| hs
zs -->|high 127| kc
ll -->|high 127| ml
ll -->|high 127| kq
bm -->|high 127| kx
hs -->|high 127| kh
hs -->|high 127| mb
zs -->|low 255| kc
ll -->|low 255| ml
ll -->|low 255| kq
bm -->|low 255| kx
hs -->|low 255| kh
hs -->|low 255| mb
kc -->|high 255| ps
kc -->|high 255| jk
kq -->|high 255| zf
kx -->|high 255| vk
kx -->|high 255| mk
mb -->|high 255| qb
mb -->|high 255| kh
kc -->|low 511| ps
kc -->|low 511| jk
kq -->|low 511| zf
kx -->|low 511| vk
kx -->|low 511| mk
mb -->|low 511| qb
mb -->|low 511| kh
jk -->|high 511| hh
jk -->|high 511| ps
zf -->|high 511| ml
zf -->|high 511| bd
vk -->|high 511| mk
vk -->|high 511| vl
qb -->|high 511| rj
qb -->|high 511| kh
jk -->|low 1023| hh
jk -->|low 1023| ps
zf -->|low 1023| ml
zf -->|low 1023| bd
vk -->|low 1023| mk
vk -->|low 1023| vl
qb -->|low 1023| rj
qb -->|low 1023| kh
hh -->|high 1023| ps
hh -->|high 1023| jb
bd -->|high 1023| qr
bd -->|high 1023| ml
vl -->|high 1023| zk
vl -->|high 1023| mk
rj -->|high 1023| mm
rj -->|high 1023| kh
hh -->|low 2047| ps
hh -->|low 2047| jb
bd -->|low 2047| qr
bd -->|low 2047| ml
vl -->|low 2047| zk
vl -->|low 2047| mk
rj -->|low 2047| mm
rj -->|low 2047| kh
jb -->|high 2047| ps
qr -->|high 2047| ml
zk -->|high 2047| mk
mm -->|high 2047| kh
ml -->|low 3822| bp
ml -->|low 3822| gd
ml -->|low 3822| qv
ml -->|low 3822| kq
bp -->|high 3822| zh
qr -->|low 3822| ml
ps -->|low 3846| xc
ps -->|low 3846| mq
ps -->|low 3846| jt
ps -->|low 3846| zs
ps -->|low 3846| sr
ps -->|low 3846| nt
ps -->|low 3846| pq
xc -->|high 3846| zh
jb -->|low 3846| ps
mk -->|low 3876| kf
mk -->|low 3876| qn
mk -->|low 3876| nh
mk -->|low 3876| pd
mk -->|low 3876| dq
mk -->|low 3876| mg
mk -->|low 3876| bm
pd -->|high 3876| zh
zk -->|low 3876| mk
kh -->|low 4000| jg
kh -->|low 4000| qx
kh -->|low 4000| md
kh -->|low 4000| th
kh -->|low 4000| hf
kh -->|low 4000| dm
kh -->|low 4000| kk
th -->|high 4000| zh
mm -->|low 4000| kh
```