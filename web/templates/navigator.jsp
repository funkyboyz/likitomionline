<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : navigator
    Created on : Aug 14, 2012, 5:27:58 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script type="text/javascript">
    function loadContent(url) {
        $("#content").load(url);
    }

    $(document).ready(function() {
        $('#prod-menu a, .v_menu li a').each(function() {
            $(this).click(function() {
                var url = $(this).attr('href');
                loadContent(url);
                return false;
            });
        });
    });
</script>


<!------------------------------------------------ for navigator ------------------------------------------------>
<h3 id="prod-menu"><a href="../shop/index.jsp">Product Type</a></h3>
<ul class="v_menu">
    <!--    <li>
            <a href="#">Product 1</a>
            <ul>
                <h3><a href="#">Product 1</a></h3>
                <li><a href="#">Product 1.1</a></li>
                <li><a href="#">Product 1.2</a></li>
            </ul>
        </li>
        <li>
            <a href="#">Product 2</a>
            <ul>
                <h3><a href="#">Product 2</a></h3>
                <li><a href="#">Product 2.1</a></li>
                <li><a href="#">Product 2.2</a></li>
            </ul>
        </li>-->
    <!--    <li><a href="#">Product 3</a></li>
        <li><a href="#">Product 4</a></li>
        <li><a href="#">Product 5</a></li>
        <li><a href="#">Product 6</a></li>-->
    <c:forEach var="productType" items="${result}">
        <li><a href="#">${productType.prod_type_name}</a>
            <ul>
                <h3><a href="#">${productType.prod_type_name}</a></h3>
                <c:forEach var="product" items="${result}">
                    <li><a href="#">${product.prod_name}</a></li>
                </c:forEach>
            </ul>
        </li>
    </c:forEach>
</ul>

<h3 id="prod-menu"><a href="../shop/service/index.jsp">Services</a></h3>
<ul class="v_menu">
    <li><a href="../shop/service/new_order.jsp">สั่งทำสินค้าใหม่</a></li>
    <li><a href="../shop/service/quatation.jsp">ขอใบเสนอราคา</a></li>
    <li><a href="../shop/service/upload_po.jsp">สั่งซื้อสินค้า</a></li>
</ul>
