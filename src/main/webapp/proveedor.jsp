<%-- 
    Document   : proveedor
    Created on : 29/09/2021, 06:56:54 PM
    Author     : acamacho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Gestión de Proveedores</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section>
            <form method="POST" action="ControlProducto">
            <div class ="container">
                <div class="row">
                    <div class="col">
                        <center>
                        <label class = "form-label"> CREACIÓN DE PROVEEDORES: </label>
                        </center>
                        <br>
                        <label class = "form-label"> Nit: </label>                  
                        <input type="number" class="form-control" placeholder="800015156" name="idProv" required=""> 
                                                
                        <label class = "form-label"> Razon Social: </label>                  
                        <input type="text" class="form-control" placeholder="Tienda TIC 2022" name="nombreProv" required=""> 
                        
                        <label class = "form-label"> Dirección: </label>                  
                        <input type="text" class="form-control" placeholder="Vía cali No 75-95" name="dirProv" required=""> 
                        
                        <label class = "form-label"> Teléfono: </label>                  
                        <input type="number" class="form-control" placeholder="7788955" name="telProv" required="">
                                                
                        <label class = "form-label"> Email: </label>
                        <input type="email" class="form-control" placeholder="tic@hotmail.com" name="emailProv" required="">
                        <br>
                        <center>
                        <button class="btn btn-primary" name="btnAccion" value="Insertar"> Insertar </button>
                        </center>
                    </div>
                    
                    <div class="col">
                    
                    </div>
                    
                    
                    
                </div>
                            
            </div>
            
            </form>
        </section>
        
        
        
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>

