<%-- 
    Document   : login
    Created on : Sep 20, 2012, 5:44:31 AM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <form id="loginForm" class="forceLogin" name="loginForm">
            <ul id="login">
                <h3>account</h3>
                <li>
                    <label>Username</label>
                    <input type="text" name="username" value="" />
                </li>
                <li>
                    <label>Password</label>
                    <input type="password" name="password" value="" />                            
                </li>
                <li>
                    <input type="submit" value="Log in" name="login" class="accLogin" />
                </li>
                <li>
                    <a href="../account/register.jsp">Register</a>
                </li>
                <li>
                    <a href="#">Forget Password</a>
                </li>
            </ul>
        </form>
    </body>
</html>

<!-- 
<div class="fancybox-overlay fancybox-overlay-fixed" style="width: auto; height: auto; display: block;">
    <div tabindex="-1" class="fancybox-wrap fancybox-desktop fancybox-type-image fancybox-opened" style="width: 213px; height: 275px; position: fixed; top: 20px; left: 507px; opacity: 1; overflow: visible;">
        <div class="fancybox-skin" style="height: auto; padding: 15px; width: auto;">
            <div class="fancybox-outer">
                <div class="fancybox-inner" style="overflow: visible; width: 183px; height: 245px;">
                    <img alt="" src="../css/brochure/photo2.JPG" class="fancybox-image">
                </div>
                <a href="javascript:;" class="fancybox-nav fancybox-prev" title="Previous">
                    <span></span>
                </a>
                <a href="javascript:;" class="fancybox-nav fancybox-next" title="Next">
                    <span></span>
                </a>
            </div>
            <div class="fancybox-title fancybox-title-float-wrap" style="width: 97px;">
                <span class="child">Brochure page 2</span>
            </div>
            <a href="javascript:;" class="fancybox-item fancybox-close" title="Close">

            </a>
        </div>
    </div>
</div>

-->