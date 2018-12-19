<!DOCTYPE html>
<html lang="en">
  <head>
    <title>MerceariaOnline</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Mukta:300,400,700"> 
    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link href="CssCadastro/style.css" rel="stylesheet" type="text/css"/>



    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/style.css">
    
  </head>
  <body>
  
  <div class="site-wrap">
    <header class="site-navbar" role="banner">
      <div class="site-navbar-top">
        <div class="container">
          <div class="row align-items-center">

            <div class="col-6 col-md-4 order-2 order-md-1 site-search-icon text-left">
              <form action="" class="site-block-top-search">
                <span class="icon icon-search2"></span>
                <input type="text" class="form-control border-0" placeholder="Pesquisar">
              </form>
            </div>

            <div class="col-12 mb-3 mb-md-0 col-md-4 order-1 order-md-2 text-center">
              <div class="site-logo">
              <img src="logotopp.png" width="175">
              </div>
            </div>

            <div class="col-6 col-md-4 order-3 order-md-3 text-right">
              <div class="site-top-icons">
                <ul>
                  <li><a href="#"><span class="icon icon-person"></span></a></li>
                  <li><a href="#"><span class="icon icon-heart-o"></span></a></li>
                  <li>
                    <a href="cart.html" class="site-cart">
                      <span class="icon icon-shopping_cart"></span>
                      <span class="count">1</span>
                    </a>
                  </li> 
                  <li class="d-inline-block d-md-none ml-md-0"><a href="#" class="site-menu-toggle js-menu-toggle"><span class="icon-menu"></span></a></li>
                </ul>
              </div> 
            </div>

          </div>
        </div>
      </div> 
      <nav class="site-navigation text-right text-md-center" role="navigation">
        <div class="container">
          <ul class="site-menu js-clone-nav d-none d-md-block">
            <li>
              <a href="index.html">In�cio</a>
            </li>
               <li class="has-children">
              <a href="about.html">Sess�o de produtos</a>
              <ul class="dropdown">
                <li><a href="verduras.html">Verduras</a></li>
                <li><a href="frutas.html">Frutas</a></li>
                <li><a href="enlatados.html">Enlatados</a></li>
                <li><a href="carneseaves.html">Carnes e aves</a></li>
                <li><a href="higiene.html">Higiene</a></li>
                <li><a href="frioselaticinios.html">Frios e latic�nios</a></li>
                <li><a href="cereaisefarinaceos.html">Cereais e farin�ceos</a></li>
                <li><a href="bebidas.html">Bebidas</a></li>
              </ul>
            </li>
            <li><a href="pgcadastro.html">Cadastro</a></li>
            <li><a href="pglogin.html">Login</a></li>
            <li><a href="contato.html">Contato</a></li>
          </ul>
        </div>
      </nav>
    </header>
      <section>
        
       <div class="formulario">  

            <form action="Cadastro" method="post" id="validate">                  
                    
                <label>* Nome</label>
                <input name="nm_nome" type="text" class="g">

                <label>* E-mail</label>
                <input name="ds_email" type="text" class="g">

                <label>Telefone celular</label>
                <input name="nr_telefone" type="text" class="p" id="celular">

                <label>Data de Nascimento</label>
                <input name="dt_nascimento" type="text" class="p" id="data">

                <label>CPF</label>
                <input name="nr_cpf" type="text" class="p" id="cpf">

                <label>RG</label>
                <input name="nr_rg" type="text" class="p" id="rg">

                <label>CEP</label>
                <input name="CEP" type="text" class="p" id="cep">

                <label>Endere�o</label>
                <input name="endereco" type="text" class="g">
                
                <label>N�mero</label>
                <input name="" type="text" class="pp" id= numero>
             
                <label>Complemento</label>
                <input name="Complemento" type="text" class="m">
                
                <label>Bairro</label>
                <input name="Bairro" type="text" class="p">
                
                <label>Cidade</label>
                <input name="Cidade" type="text" class="p">

                <label>Estado</label>
                <select name="" class="p">
                    <option>Selecione</option>
           
                    <option value="RJ">Rio de Janeiro</option>

                </select>

                <label>Senha</label>
                <input name="" type="ds_senha" class="p">  

                <label>Confirmar senha</label>
                <input name="" type="" class="p">  
                

                <input type="submit" value="Enviar">

            </form>
      </div><!--/formulario-->
                
    </section>

    
     
    <footer class="site-footer border-top">
    </footer>
  </div>

  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>

  <script src="js/main.js"></script>

  <script type="text/javascript" src="Script/jquery-1.10.2.min.js"></script>
  <script type="text/javascript" src="Script/jquery.maskedinput.min.js"></script>
  <script type="text/javascript" src="Script/jquery.validate.min.js"></script>
  <script type="text/javascript" src="Script/jquery.zebra-datepicker.js"></script>

    
  </body>
</html>