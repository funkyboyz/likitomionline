<%-- 
    Document   : header
    Created on : Aug 14, 2012, 5:27:18 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script type="text/javascript" src="../js/jquery.tables.js"></script>
<script type="text/javascript">
    function loadContent(url) {
        $("#content").load(url);
    }
    
    $(document).ready(function() {
        $('#header li').each(function() {
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

<!--------------------------------------------------- for Header --------------------------------------------------->
<div>
    <a href="../index.jsp">
        <div class="imgHeader"></div>
    </a>
</div>

<!------------------------------------------------- for Main Menu --------------------------------------------------> 
<div class="main-menu">
    <ul class="ttt">
        <li id="home-menu"><a href="../index.jsp"><span>Home</span></a></li>
        <li id="prod-menu" class="for-nav"><a href="../shop/index.jsp"><span>Products</span></a>
            <ul class="ttt">
                <li class="cart-menu">
                    <a href="../shop/cart/index.jsp"><h3>Cart</h3><div class="img"></div></a>
                    <label>0 Item(s)</label>
                </li>
                <li class="cart-menu"><a href="../shop/index.jsp"><h3>Products</h3></a>
                    <ul>
                        <li><a href="#"><span>Product 1</span></a>
                            <ul>
                                <li><a href="#"><h3>Product 1</h3></a>
                                    <ul>
                                        <li><a href="#"><span>Product 1.1</span></a></li>
                                        <li><a href="#"><span>Product 1.2</span></a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li><a href="#"><span>Product 2</span></a>
                            <ul>
                                <li><a href="#"><h3>Product 2</h3></a>
                                    <ul>
                                        <li><a href="#"><span>Product 2.1</span></a></li>
                                        <li><a href="#"><span>Product 2.2</span></a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li><a href="#"><span>Product 3</span></a></li>
                        <li><a href="#"><span>Product 4</span></a></li>
                        <li><a href="#"><span>Product 5</span></a></li>
                        <li><a href="#"><span>Product 6</span></a></li>
                    </ul>
                </li>
                <li class="cart-menu"><a href="../shop/service/index.jsp"><h3>Services</h3></a>
                    <ul>
                        <li><a href="../shop/service/new_order.jsp"><span>สั่งทำสินค้าใหม่</span></a></li>
                        <li><a href="../shop/service/quatation.jsp"><span>ขอใบเสนอราคา</span></a></li>
                        <li><a href="../shop/service/upload_po.jsp"><span>สั่งซื้อสินค้า</span></a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li id="acc-menu"><a href="../account/index.jsp"><span>Account</span></a></li>
        <li id="manage-menu" class="hidden"><a href="../back/index.jsp"><span>Management</span></a>
            <ul>
                <li><a href="../back/index.jsp"><h3>Management</h3></a>
                    <ul>
                        <li><a href="../back/product/product_type_mgmt.jsp"><span>Product Type Management</span></a></li>
                        <li><a href="../back/product/product_mgmt.jsp"><span>Product Management</span></a></li>
                        <li><a href="#"><span>Employee Management</span></a></li>
                        <li><a href="#"><span>Report Sale</span></a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li id="about-menu"><a href="../company/aboutus.jsp"><span>About Us</span></a></li>
        <li id="contact-menu"><a href="../company/contactus.jsp"><span>Contact Us</span></a></li>
        <li id="join-menu"><a href="../company/joinus.jsp"><span>Join Us</span></a></li>
    </ul>
</div>

<!-------------------------------------------------- for sub menu --------------------------------------------------> 
<div class="sub-menu">

    <!--------- for path pane --------->
    <div class="path-pane">
        <a href="../index.jsp" class="arrow_box">Home</a>
        <a href="#" class="arrow_box">Product</a>
        <a href="#" class="arrow_box">Management</a>
        <label class="no_arrow">Join Us</label>
    </div>

    <!------------------------------------------------ for sub-menu right --------------------------------------------------> 
    <div id="submenu-right">
        <!------------------------------------------------ for cart pane --------------------------------------------------> 
        <form id="cartForm" name="cartForm">
            <div id="cart" class="cart-pane">
                <ul>
                    <li><a href="../shop/cart/index.jsp"><div id="cart-pic">Cart</div></a>
                        <ul>
                            <h3>Cart</h3>
                            <li>
                                <div id="cart-item">
                                    <div id="cart-order">
                                        <table class="sortable" border="0">
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        <a href="#">
                                                            <img src="../img/product/small/box_rsc.png" width="100" height="69" alt="box_rsc"/>
                                                        </a>
                                                    </td>
                                                    <td><a href="#">Product Name</a></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <a href="../shop/cart/index.jsp">You have 0 Item(s)</a>
                                </div>
                                <a href="../shop/cart/index.jsp">Purchased การทำรายการ</a>
                                <a href="#">Purchased History</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </form>

        <!--------------------------------------------- for account pane --------------------------------------------------->
        <form id="loginForm" name="loginForm">
            <div id="account" class="account-pane">
                <ul>
                    <li><a href="../account/index.jsp" class="acc"><div id="acc-pic">Account</div></a>
                        <ul>
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
                    </li>
                </ul>
            </div>
        </form>

        <!--------------------------------------------- for search pane --------------------------------------------------->
        <div id="search-pane">
            <input type="text" id="search" placeholder="Search..." />
        </div>
    </div>
</div>

<div id="clear"></div>