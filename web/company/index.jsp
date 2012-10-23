<%-- 
    Document   : home
    Created on : Aug 31, 2012, 9:21:29 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${initParam.shopName} - Home</title>
        <link type="text/css" rel="stylesheet" href="../css/style.css" media="screen" />
        <link type="text/css" rel="stylesheet" href="../css/jquery.fancybox.css" media="screen" />
        <!--<link type="text/css" rel="stylesheet" href="../css/designForm.css" media="screeen" />-->
        <script type="text/javascript" src="../js/jquery.js" ></script>
        <!--<script type="text/javascript" src="../js/jquery.easing.js"></script>-->
        <!--<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>-->
        <!--<script type="text/javascript" src="../js/jquery.min.js"></script>-->
        <script type="text/javascript" src="../js/jquery.fancybox.pack.js"></script>
        <!--<script type="text/javascript" src="../js/jquery.loaded.js"></script>-->
        <script type="text/javascript" src="../js/jquery.tables.js"></script>
        <script type="text/javascript" src="../js/jquery.MultiFile.js"></script>
        <script type="text/javascript" src="../js/jquery.MultiFile.pack.js"></script>
        <script type="text/javascript" src="../js/jquery.tools.min.js"></script>
        <script type="text/javascript" src="../js/jquery.leanModal.min.js"></script>
        <!--<script type="text/javascript" src="../js/jquery.lightbox_me.js"></script>-->
        <script type="text/javascript">
            $(document).ready(function() {
                $("#header").load("../templates/header.jsp");
                $("#navigator").load("../templates/navigator.jsp");
                $("#content").load("../templates/content.jsp");
                $("#footer").load("../templates/footer.jsp");
            });
            
            $(document).ready(function() {
                $('#navigator').each(function() {
                    $(this).hide(function() {
                        $(this).fadeOut('slow');
                        $('#content').animate({ width : '97%' }, 'slow');
                        return false;
                    });
                });
            });
        </script>
        <link rel="shortcut icon" href="../favicon.ico" /> 
    </head>
    <body>
        <div id="wrapper">
            <div id="header">                   <!-- z-index= 100 -->
                <div id="Menu"></div>             <!-- z-index= 700 -->
            </div>
            <div id="navigator"></div>      <!-- z-index= 400 -->
            <div id="content">                      <!-- z-index= 200 -->
                <!--<div id="main-content"></div>         z-index= 300 -->
            </div>
            <div id="clear"></div>
            <div id="footer"></div>             <!-- z-index= 600 -->
        </div>
    </body>
</html>
