<%-- 
    Document   : product_Detail
    Created on : Sep 9, 2012, 5:03:23 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript" src="../js/jquery.tables.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#tab-menu li").click(function() {
                    $("#tab-menu li").removeClass("selected");
                    $(this).addClass("selected");
                    $(".tab_content").hide();
                    var selected_tab = $(this).find("a").attr("href");
                    $(selected_tab).fadeIn();
                    return false;
                });
            });
            
            $(document).ready(function() {
                $('#productPic').scrollable();
            });
        </script>
    </head>
    <body>
        <form name="productDetail" id="productDetail">
            <fieldset>
                <legend>Product Name</legend>
                <div id="productPic">
                    <div class="productPic-img">
                        <a class="fancybox" rel="gallery" href="../img/product/large/SHH-240.jpg">
                            <img src="../img/product/medium/SHH-240.jpg" width="300" height="150" alt="SHH-240"/>
                        </a>
                        <a class="fancybox" rel="gallery" href="../img/product/large/SHH-240_2.jpg">
                            <img src="../img/product/medium/SHH-240_2.jpg" width="300" height="195" alt="SHH-240_2"/>
                        </a>
                    </div>
                </div>

                <div id="shopButton">
                    <ul>
                        <li><a href="#"><div class="print-pic">สั่งพิมพ์</div></a></li>
                        <li><a href="#"><div class="cart-pic">Add to Cart</div></a></li>
                        <li><a href="#"><div class="quote-pic">ขอใบเสนอราคา</div></a></li>
                    </ul>
                </div>

                <div id="clear"></div>

                <div id="prodSpecTab">
                    <ul id="tab-menu">
                        <li class="selected"><a href="#tab1">Product Model</a></li>
                        <li><a href="#tab2">Productivity Features</a></li>
                        <li><a href="#tab3">Color &AMP; Joint</a></li>
                    </ul>

                    <ul id="tab-boxes">
                        <li id="tab1" class="tab_content">
                            <h3>Product Model</h3>
                            <table class="sortable paginated">
                                <tbody>
                                    <tr>
                                        <td>Code</td>
                                        <td>Product Code</td>
                                    </tr>
                                    <tr>
                                        <td>Name</td>
                                        <td>Product Name</td>
                                    </tr>
                                    <tr>
                                        <td>Customer</td>
                                        <td>Customer Company Name</td>
                                    </tr>
                                    <tr>
                                        <td>Box Style</td>
                                        <td>Product Type</td>
                                    </tr>
                                    <tr>
                                        <td>Date Modified</td>
                                        <td>dd/mm/yyyy</td>
                                    </tr>
                                </tbody>
                            </table>
                            <span></span>
                        </li>
                        <li id="tab2" class="tab_content">
                            <h3>Productivity Features</h3>
                            <table class="sortable paginated">
                                <thead>
                                    <tr>
                                        <th colspan="2">Board Combination</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>D-F</td>
                                        <td>Raw Mat Type</td>
                                    </tr>
                                    <tr>
                                        <td>BM</td>
                                        <td>Raw Mat Type</td>
                                    </tr>
                                    <tr>
                                        <td>B-L</td>
                                        <td>Raw Mat Type</td>
                                    </tr>
                                    <tr>
                                        <td>CM</td>
                                        <td>Raw Mat Type</td>
                                    </tr>
                                    <tr>
                                        <td>C-L</td>
                                        <td>Raw Mat Type</td>
                                    </tr>
                                </tbody>
                            </table>
                            <table class="sortable paginated" border="0">
                                <thead>
                                    <tr>
                                        <th colspan="2">Inner Dimension</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Length(mm.)</td>
                                        <td>Amount</td>
                                    </tr>
                                    <tr>
                                        <td>Width(mm.)</td>
                                        <td>Amount</td>
                                    </tr>
                                    <tr>
                                        <td>Heigh(mm.)</td>
                                        <td>Amount</td>
                                    </tr>
                                </tbody>
                            </table>
                            <span></span>
                        </li>
                        <li id="tab3" class="tab_content">
                            <h3>Color&AMP;Joint</h3>
                            <table class="sortable paginated" border="0">
                                <thead>
                                    <tr>
                                        <th colspan="2">Color</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Product Code</td>
                                        <td>Product Code</td>
                                    </tr>
                                    <tr>
                                        <td>Box Style</td>
                                        <td>Product Type</td>
                                    </tr>
                                    <tr>
                                        <td>Ink</td>
                                        <td>Ink Color</td>
                                    </tr>
                                </tbody>
                            </table>
                            <table class="sortable paginated" border="0">
                                <thead>
                                    <tr>
                                        <th colspan="2">Joint</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Glue</td>
                                        <td>
                                            <img src="../css/img/accept.png" width="16" height="16" alt="accept"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Stitch Color</td>
                                        <td>Stitch Color</td>
                                    </tr>
                                </tbody>
                            </table>
                            <span></span>
                        </li>
                    </ul>
                </div>
            </fieldset>
        </form>
    </body>
</html>
