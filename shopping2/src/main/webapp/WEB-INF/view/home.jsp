<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/shop-homepage.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<style>
 .carousel-indicators{
 position:absolute;
 bottom:10px;
 left:50%;
 z-index:15;
 width:60%;
 padding-left:0;
 margin-left:-30%;
 text-align:center;
 }
 
</style>
</head>

<body>
<!--
      <!-- Page Content -->
	<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel" style="width:100%;height:100;align:center" >
    <!-- Indicators -->
    <ol class="carousel-indicators" >
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="${image}/137.jpg"  alt="Chania" width="150px" height="150px">
        <div class="carousel-caption">
          
        </div>
      </div>

      <div class="item">
        <img src="${image}/1.jpg" alt="Chania"  width="150px" height="150px">
        <div class="carousel-caption">
           </div>
      </div>
    
      <div class="item">
        <img src="${image}/139.jpg" alt="Flower"  width="150px" height="150px">
        <div class="carousel-caption">
          </div>
      </div>

      
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

      
    <!-- /.container -->

   
</body>

</html>
