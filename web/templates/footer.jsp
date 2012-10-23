<%-- 
    Document   : footer
    Created on : Aug 14, 2012, 5:27:27 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--<script type="text/javascript" src="../js/jquery.loaded.js"></script>-->
<script type="text/javascript">
    function loadContent(url) {
        $("#content").load(url);
    }

    $(document).ready(function() {
        $('.footer-img, .footer-menu li, .footer-last li').each(function() {
            $(this)
            .find('a')
            .click(function() {
                var url = $(this).attr('href');
                loadContent(url);
                return false;
            });
        });
    });
</script>

<div class="footer-img">
    <a href="../shop/cart/index.jsp" title="Cart">
        <div class="img"></div>
    </a>
</div>

<div class="footer-menu">
    <ul>
        <li id="home-menu" class="seperate">
            <a href="../index.jsp">Home</a>
        </li>
        <li id="prod-menu" class="seperate">
            <a href="../shop/index.jsp">Products</a>
        </li>
        <li id="acc-menu" class="seperate">
            <a href="../account/index.jsp">Account</a>
        </li>
        <li id="manage-menu" class="seperate">
            <a href="../back/index.jsp">Management</a>
        </li>
        <li id="about-menu" class="seperate">
            <a href="../company/aboutus.jsp">About Us</a>
        </li>
        <li id="contact-menu" class="seperate">
            <a href="../company/contactus.jsp">Contact Us</a>
        </li>
        <li id="join-menu">
            <a href="../company/joinus.jsp">Join Us</a>
        </li>
    </ul>
</div>

<div class="footer-last">
    <label>
        &COPY;Copyright 2012 All contents <a href="../index.jsp">Likitomi (Thailand) Co.,Ltd.</a>
    </label>
</div>
<div id="clear"></div>