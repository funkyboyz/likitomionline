/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    var spacing = 140;              // แก้ไขความกว้างรูป
    $('#slideshows').css({
        'width': spacing * 3,
        'height': '166px',
        'overflow': 'hidden'
    }).find('.slideshows-img a.fancybox').css({
        'float': 'none',
        'position': 'absolute',
        'left': 1000
    });
    
    var $enlargeCover = $('<img />')
    .addClass('enlarged')
    .hide()
    .appendTo('body');
    
    // set function ซ้อนรูป
    function createControl(src) {
        return $('<img />')
        .attr('src', src)
        .addClass('control')
        .css('opacity', 0.6)
        .css('display', 'none');
    }
    
    var $leftRollover = createControl('../css/img/arrow_left.png');
    var $rightRollover = createControl('../css/img/arrow_right.png');
    var $enlargeRollover = createControl('../css/img/zoom.png');
    
    // set function การจัดตำแหน่งรูป
    var setUpCovers = function() {
        var $covers = $('#slideshows .slideshows-img a.fancybox');
        $covers.unbind('click mouseenter mouseleave');
        
        //        รูปทางซ้าย จะเลื่อนไปทางขวา
        $covers.eq(0)
        .css('left', 0)
        .click(function(event) {
            $covers.eq(0).animate({
                'left': spacing
            }, 'fast');
            $covers.eq(1).animate({
                'left': spacing * 2
            }, 'fast');
            $covers.eq(2).animate({
                'left': spacing * 3
            }, 'fast');
            $covers.eq($covers.length - 1)
            .css('left', -spacing)
            .animate({
                'left': 0
            }, 'fast', function() {
                $(this).prependTo('#slideshows .slideshows-img .fancybox');
                setUpCovers();
            });
            event.preventDefault();
        }).hover(function() {
            $leftRollover.appendTo(this).show();
        }, function() {
            $leftRollover.hide();
        });
        
        // รูปทางขวา จะเลื่อนไปทางซ้าย
        $covers.eq(2)
        .css('left', spacing * 2)
        .click(function(event) {
            $covers.eq(0)
            .animate({
                'left': -spacing
            }, 'fast', function() {
                $(this).appendTo("#slideshows .slideshows-img .fancybox");
                setUpCovers();
            });
            $covers.eq(1).animate({
                'left': 0
            }, 'fast');
            $covers.eq(2).animate({
                'left': spacing
            }, 'fast');
            $covers.eq(3)
            .css('left', spacing * 3)
            .animate({
                'left': spacing *2
            }, 'fast');
            event.preventDefault();
        }).hover(function() {
            $rightRollover.appendTo(this).show();
        }, function() {
            $rightRollover.hide();
        });
        $covers.eq(1)
        .css('left', spacing)
        .click(function(event) {
            $enlargeCover
            .attr('src', $(this).attr('href'))
            .fancybox();
            event.preventDefault();
        })
        .hover(function() {
            $enlargeRollover.appendTo(this).show();
        }, function() {
            $enlargeRollover.hide();
        });
    };
    setUpCovers();
});
