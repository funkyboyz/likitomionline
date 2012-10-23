/*! fancyBox v2.1.0 fancyapps.com | fancyapps.com/fancybox/#license */
(function(u,p,f,q){
    var o=f(u),n=f(p),b=f.fancybox=function(){
        b.open.apply(this,arguments)
        },z=null,m=p.createTouch!==q,x=function(a){
        return a&&a.hasOwnProperty&&a instanceof f
        },s=function(a){
        return a&&"string"===f.type(a)
        },C=function(a){
        return s(a)&&0<a.indexOf("%")
        },k=function(a,c){
        var e=parseInt(a,10);
        c&&C(a)&&(e*=b.getViewport()[c]/100);
        return Math.ceil(e)
        },v=function(a,b){
        return k(a,b)+"px"
        };
        
    f.extend(b,{
        version:"2.1.0",
        defaults:{
            padding:15,
            margin:20,
            width:800,
            height:600,
            minWidth:100,
            minHeight:100,
            maxWidth:9999,
            maxHeight:9999,
            autoSize:!0,
            autoHeight:!1,
            autoWidth:!1,
            autoResize:!m,
            autoCenter:!m,
            fitToView:!0,
            aspectRatio:!1,
            topRatio:0.5,
            leftRatio:0.5,
            scrolling:"auto",
            wrapCSS:"",
            arrows:!0,
            closeBtn:!0,
            closeClick:!1,
            nextClick:!1,
            mouseWheel:!0,
            autoPlay:!1,
            playSpeed:3E3,
            preload:3,
            modal:!1,
            loop:!0,
            ajax:{
                dataType:"html",
                headers:{
                    "X-fancyBox":!0
                    }
                },
        iframe:{
            scrolling:"auto",
            preload:!0
            },
        swf:{
            wmode:"transparent",
            allowfullscreen:"true",
            allowscriptaccess:"always"
        },
        keys:{
            next:{
                13:"left",
                34:"up",
                39:"left",
                40:"up"
            },
            prev:{
                8:"right",
                33:"down",
                37:"right",
                38:"down"
            },
            close:[27],
            play:[32],
            toggle:[70]
            },
        direction:{
            next:"left",
            prev:"right"
        },
        scrollOutside:!0,
        index:0,
        type:null,
        href:null,
        content:null,
        title:null,
        tpl:{
            wrap:'<div class="fancybox-wrap" tabIndex="-1"><div class="fancybox-skin"><div class="fancybox-outer"><div class="fancybox-inner"></div></div></div></div>',
            image:'<img class="fancybox-image" src="{href}" alt="" />',
            iframe:'<iframe id="fancybox-frame{rnd}" name="fancybox-frame{rnd}" class="fancybox-iframe" frameborder="0" vspace="0" hspace="0"'+
            (f.browser.msie?' allowtransparency="true"':"")+"></iframe>",
            error:'<p class="fancybox-error">The requested content cannot be loaded.<br/>Please try again later.</p>',
            closeBtn:'<a title="Close" class="fancybox-item fancybox-close" href="javascript:;"></a>',
            next:'<a title="Next" class="fancybox-nav fancybox-next" href="javascript:;"><span></span></a>',
            prev:'<a title="Previous" class="fancybox-nav fancybox-prev" href="javascript:;"><span></span></a>'
        },
        openEffect:"fade",
        openSpeed:250,
        openEasing:"swing",
        openOpacity:!0,
        openMethod:"zoomIn",
        closeEffect:"fade",
        closeSpeed:250,
        closeEasing:"swing",
        closeOpacity:!0,
        closeMethod:"zoomOut",
        nextEffect:"elastic",
        nextSpeed:250,
        nextEasing:"swing",
        nextMethod:"changeIn",
        prevEffect:"elastic",
        prevSpeed:250,
        prevEasing:"swing",
        prevMethod:"changeOut",
        helpers:{
            overlay:{
                closeClick:!0,
                speedOut:200,
                showEarly:!0,
                css:{}
        },
        title:{
            type:"float"
        }
    },
    onCancel:f.noop,
    beforeLoad:f.noop,
    afterLoad:f.noop,
    beforeShow:f.noop,
    afterShow:f.noop,
    beforeChange:f.noop,
    beforeClose:f.noop,
    afterClose:f.noop
    },
group:{},
opts:{},
previous:null,
coming:null,
current:null,
isActive:!1,
isOpen:!1,
isOpened:!1,
wrap:null,
skin:null,
outer:null,
inner:null,
player:{
    timer:null,
    isActive:!1
    },
ajaxLoad:null,
imgPreload:null,
transitions:{},
helpers:{},
open:function(a,c){
    if(a&&(f.isPlainObject(c)||(c={}),!1!==b.close(!0)))return f.isArray(a)||(a=x(a)?f(a).get():[a]),f.each(a,function(e,d){
        var j={},g,h,i,l,k;
        "object"===f.type(d)&&(d.nodeType&&(d=f(d)),x(d)?(j={
            href:d.attr("href"),
            title:d.attr("title"),
            isDom:!0,
            element:d
        },f.metadata&&
        f.extend(!0,j,d.metadata())):j=d);
        g=c.href||j.href||(s(d)?d:null);
        h=c.title!==q?c.title:j.title||"";
        l=(i=c.content||j.content)?"html":c.type||j.type;
        !l&&j.isDom&&(l=d.data("fancybox-type"),l||(l=(l=d.prop("class").match(/fancybox\.(\w+)/))?l[1]:null));
        if(s(g)&&(l||(b.isImage(g)?l="image":b.isSWF(g)?l="swf":"#"===g.charAt(0)?l="inline":s(d)&&(l="html",i=d)),"ajax"===l))k=g.split(/\s+/,2),g=k.shift(),k=k.shift();
        i||("inline"===l?g?i=f(s(g)?g.replace(/.*(?=#[^\s]+$)/,""):g):j.isDom&&(i=d):"html"===l?
            i=g:!l&&(!g&&j.isDom)&&(l="inline",i=d));
        f.extend(j,{
            href:g,
            type:l,
            content:i,
            title:h,
            selector:k
        });
        a[e]=j
        }),b.opts=f.extend(!0,{},b.defaults,c),c.keys!==q&&(b.opts.keys=c.keys?f.extend({},b.defaults.keys,c.keys):!1),b.group=a,b._start(b.opts.index)
        },
cancel:function(){
    var a=b.coming;
    a&&!1!==b.trigger("onCancel")&&(b.hideLoading(),b.ajaxLoad&&b.ajaxLoad.abort(),b.ajaxLoad=null,b.imgPreload&&(b.imgPreload.onload=b.imgPreload.onerror=null),a.wrap&&a.wrap.stop(!0).trigger("onReset").remove(),b.current||
        b.trigger("afterClose"),b.coming=null)
    },
close:function(a){
    b.cancel();
    !1!==b.trigger("beforeClose")&&(b.unbindEvents(),!b.isOpen||!0===a?(f(".fancybox-wrap").stop(!0).trigger("onReset").remove(),b._afterZoomOut()):(b.isOpen=b.isOpened=!1,b.isClosing=!0,f(".fancybox-item, .fancybox-nav").remove(),b.wrap.stop(!0,!0).removeClass("fancybox-opened"),"fixed"===b.wrap.css("position")&&b.wrap.css(b._getPosition(!0)),b.transitions[b.current.closeMethod]()))
    },
play:function(a){
    var c=function(){
        clearTimeout(b.player.timer)
        },
    e=function(){
        c();
        b.current&&b.player.isActive&&(b.player.timer=setTimeout(b.next,b.current.playSpeed))
        },d=function(){
        c();
        f("body").unbind(".player");
        b.player.isActive=!1;
        b.trigger("onPlayEnd")
        };
        
    if(!0===a||!b.player.isActive&&!1!==a){
        if(b.current&&(b.current.loop||b.current.index<b.group.length-1))b.player.isActive=!0,f("body").bind({
            "afterShow.player onUpdate.player":e,
            "onCancel.player beforeClose.player":d,
            "beforeLoad.player":c
        }),e(),b.trigger("onPlayStart")
            }else d()
        },
next:function(a){
    var c=b.current;
    c&&(s(a)||(a=c.direction.next),b.jumpto(c.index+1,a,"next"))
    },
prev:function(a){
    var c=b.current;
    c&&(s(a)||(a=c.direction.prev),b.jumpto(c.index-1,a,"prev"))
    },
jumpto:function(a,c,e){
    var d=b.current;
    if(d&&(a=k(a),b.direction=c||d.direction[a>=d.index?"next":"prev"],b.router=e||"jumpto",d.loop&&(0>a&&(a=d.group.length+a%d.group.length),a%=d.group.length),d.group[a]!==q))b.cancel(),b._start(a)
        },
reposition:function(a,c){
    var e;
    b.isOpen&&(e=b._getPosition(c),a&&"scroll"===a.type?(delete e.position,b.wrap.stop(!0,
        !0).animate(e,200)):b.wrap.css(e))
    },
update:function(a){
    var c=a&&a.type,e=!c||"orientationchange"===c;
    e&&(clearTimeout(z),z=null);
    if(b.isOpen&&!z){
        if(e||m)b.wrap.removeAttr("style").addClass("fancybox-tmp"),b.trigger("onUpdate");
        z=setTimeout(function(){
            var d=b.current;
            if(d){
                b.wrap.removeClass("fancybox-tmp");
                c!=="scroll"&&b._setDimension();
                c==="scroll"&&d.canShrink||b.reposition(a);
                b.trigger("onUpdate");
                z=null
                }
            },m?500:e?20:300)
    }
},
toggle:function(a){
    b.isOpen&&(b.current.fitToView="boolean"===f.type(a)?
        a:!b.current.fitToView,b.update())
    },
hideLoading:function(){
    n.unbind("keypress.fb");
    f("#fancybox-loading").remove()
    },
showLoading:function(){
    var a,c;
    b.hideLoading();
    n.bind("keypress.fb",function(a){
        if(27===(a.which||a.keyCode))a.preventDefault(),b.cancel()
            });
    a=f('<div id="fancybox-loading"><div></div></div>').click(b.cancel).appendTo("body");
    b.defaults.fixed||(c=b.getViewport(),a.css({
        position:"absolute",
        top:0.5*c.h+c.y,
        left:0.5*c.w+c.x
        }))
    },
getViewport:function(){
    var a=b.current?b.current.locked:!1,
    c={
        x:o.scrollLeft(),
        y:o.scrollTop()
        };
        
    a?(c.w=a[0].clientWidth,c.h=a[0].clientHeight):(c.w=m&&u.innerWidth?u.innerWidth:o.width(),c.h=m&&u.innerHeight?u.innerHeight:o.height());
    return c
    },
unbindEvents:function(){
    b.wrap&&x(b.wrap)&&b.wrap.unbind(".fb");
    n.unbind(".fb");
    o.unbind(".fb")
    },
bindEvents:function(){
    var a=b.current,c;
    a&&(o.bind("orientationchange.fb"+(m?"":" resize.fb")+(a.autoCenter&&!a.locked?" scroll.fb":""),b.update),(c=a.keys)&&n.bind("keydown.fb",function(e){
        var d=e.which||e.keyCode,j=e.target||
        e.srcElement;
        !e.ctrlKey&&(!e.altKey&&!e.shiftKey&&!e.metaKey&&(!j||!j.type&&!f(j).is("[contenteditable]")))&&f.each(c,function(c,j){
            if(1<a.group.length&&j[d]!==q)return b[c](j[d]),e.preventDefault(),!1;
            if(-1<f.inArray(d,j))return b[c](),e.preventDefault(),!1
                })
        }),f.fn.mousewheel&&a.mouseWheel&&b.wrap.bind("mousewheel.fb",function(c,d,j,g){
        for(var h=f(c.target||null),i=!1;h.length&&!i&&!h.is(".fancybox-skin")&&!h.is(".fancybox-wrap");)i=h[0]&&!(h[0].style.overflow&&"hidden"===h[0].style.overflow)&&
            (h[0].clientWidth&&h[0].scrollWidth>h[0].clientWidth||h[0].clientHeight&&h[0].scrollHeight>h[0].clientHeight),h=f(h).parent();
        if(0!==d&&!i&&1<b.group.length&&!a.canShrink){
            if(0<g||0<j)b.prev(0<g?"down":"left");
            else if(0>g||0>j)b.next(0>g?"up":"right");
            c.preventDefault()
            }
        }))
},
trigger:function(a,c){
    var e,d=c||b.coming||b.current;
    if(d){
        f.isFunction(d[a])&&(e=d[a].apply(d,Array.prototype.slice.call(arguments,1)));
        if(!1===e)return!1;
        "onCancel"===a&&!b.isOpened&&(b.isActive=!1);
        d.helpers&&f.each(d.helpers,
            function(c,e){
                if(e&&b.helpers[c]&&f.isFunction(b.helpers[c][a]))b.helpers[c][a](e,d)
                    });
        f.event.trigger(a+".fb")
        }
    },
isImage:function(a){
    return s(a)&&a.match(/\.(jp(e|g|eg)|gif|png|bmp|webp)((\?|#).*)?$/i)
    },
isSWF:function(a){
    return s(a)&&a.match(/\.(swf)((\?|#).*)?$/i)
    },
_start:function(a){
    var c={},e,d,a=k(a);
    e=b.group[a]||null;
    if(!e)return!1;
    c=f.extend(!0,{},b.opts,e);
    e=c.margin;
    d=c.padding;
    "number"===f.type(e)&&(c.margin=[e,e,e,e]);
    "number"===f.type(d)&&(c.padding=[d,d,d,d]);
    c.modal&&f.extend(!0,c,

    {
        closeBtn:!1,
        closeClick:!1,
        nextClick:!1,
        arrows:!1,
        mouseWheel:!1,
        keys:null,
        helpers:{
            overlay:{
                closeClick:!1
                }
            }
    });
c.autoSize&&(c.autoWidth=c.autoHeight=!0);
"auto"===c.width&&(c.autoWidth=!0);
"auto"===c.height&&(c.autoHeight=!0);
c.group=b.group;
c.index=a;
b.coming=c;
if(!1===b.trigger("beforeLoad"))b.coming=null;
else{
    d=c.type;
    e=c.href;
    if(!d)return b.coming=null,b.current&&b.router&&"jumpto"!==b.router?(b.current.index=a,b[b.router](b.direction)):!1;
    b.isActive=!0;
    if("image"===d||"swf"===d)c.autoHeight=c.autoWidth=
        !1,c.scrolling="visible";
    "image"===d&&(c.aspectRatio=!0);
    "iframe"===d&&m&&(c.scrolling="scroll");
    c.wrap=f(c.tpl.wrap).addClass("fancybox-"+(m?"mobile":"desktop")+" fancybox-type-"+d+" fancybox-tmp "+c.wrapCSS).appendTo(c.parent);
    f.extend(c,{
        skin:f(".fancybox-skin",c.wrap),
        outer:f(".fancybox-outer",c.wrap),
        inner:f(".fancybox-inner",c.wrap)
        });
    f.each(["Top","Right","Bottom","Left"],function(a,b){
        c.skin.css("padding"+b,v(c.padding[a]))
        });
    b.trigger("onReady");
    if("inline"===d||"html"===d){
        if(!c.content||
            !c.content.length)return b._error("content")
            }else if(!e)return b._error("href");
    "image"===d?b._loadImage():"ajax"===d?b._loadAjax():"iframe"===d?b._loadIframe():b._afterLoad()
    }
},
_error:function(a){
    f.extend(b.coming,{
        type:"html",
        autoWidth:!0,
        autoHeight:!0,
        minWidth:0,
        minHeight:0,
        scrolling:"no",
        hasError:a,
        content:b.coming.tpl.error
        });
    b._afterLoad()
    },
_loadImage:function(){
    var a=b.imgPreload=new Image;
    a.onload=function(){
        this.onload=this.onerror=null;
        b.coming.width=this.width;
        b.coming.height=this.height;
        b._afterLoad()
        };
        
    a.onerror=function(){
        this.onload=this.onerror=null;
        b._error("image")
        };
        
    a.src=b.coming.href;
    (a.complete===q||!a.complete)&&b.showLoading()
    },
_loadAjax:function(){
    var a=b.coming;
    b.showLoading();
    b.ajaxLoad=f.ajax(f.extend({},a.ajax,{
        url:a.href,
        error:function(a,e){
            b.coming&&"abort"!==e?b._error("ajax",a):b.hideLoading()
            },
        success:function(c,e){
            "success"===e&&(a.content=c,b._afterLoad())
            }
        }))
},
_loadIframe:function(){
    var a=b.coming,c=f(a.tpl.iframe.replace(/\{rnd\}/g,(new Date).getTime())).attr("scrolling",
        m?"auto":a.iframe.scrolling).attr("src",a.href);
    f(a.wrap).bind("onReset",function(){
        try{
            f(this).find("iframe").hide().attr("src","//about:blank").end().empty()
            }catch(a){}
    });
a.iframe.preload&&(b.showLoading(),c.one("load",function(){
    f(this).data("ready",1);
    m||f(this).bind("load.fb",b.update);
    f(this).parents(".fancybox-wrap").width("100%").removeClass("fancybox-tmp").show();
    b._afterLoad()
    }));
a.content=c.appendTo(a.inner);
a.iframe.preload||b._afterLoad()
},
_preloadImages:function(){
    var a=b.group,c=b.current,
    e=a.length,d=c.preload?Math.min(c.preload,e-1):0,f,g;
    for(g=1;g<=d;g+=1)f=a[(c.index+g)%e],"image"===f.type&&f.href&&((new Image).src=f.href)
        },
_afterLoad:function(){
    var a=b.coming,c=b.current,e,d,j,g,h;
    b.hideLoading();
    if(a&&!1!==b.isActive)if(!1===b.trigger("afterLoad",a,c))a.wrap.stop(!0).trigger("onReset").remove(),b.coming=null;
        else{
        c&&(b.trigger("beforeChange",c),c.wrap.stop(!0).removeClass("fancybox-opened").find(".fancybox-item, .fancybox-nav").remove(),"fixed"===c.wrap.css("position")&&c.wrap.css(b._getPosition(!0)));
        b.unbindEvents();
        e=a.content;
        d=a.type;
        j=a.scrolling;
        f.extend(b,{
            wrap:a.wrap,
            skin:a.skin,
            outer:a.outer,
            inner:a.inner,
            current:a,
            previous:c
        });
        g=a.href;
        switch(d){
            case "inline":case "ajax":case "html":
                a.selector?e=f("<div>").html(e).find(a.selector):x(e)&&(e.data("fancybox-placeholder")||e.data("fancybox-placeholder",f('<div class="fancybox-placeholder"></div>').insertAfter(e).hide()),e=e.show().detach(),a.wrap.bind("onReset",function(){
                f(this).find(e).length&&e.hide().replaceAll(e.data("fancybox-placeholder")).data("fancybox-placeholder",
                    false)
                }));
            break;
            case "image":
                e=a.tpl.image.replace("{href}",g);
                break;
            case "swf":
                e='<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="100%" height="100%"><param name="movie" value="'+g+'"></param>',h="",f.each(a.swf,function(a,b){
                e=e+('<param name="'+a+'" value="'+b+'"></param>');
                h=h+(" "+a+'="'+b+'"')
                }),e+='<embed src="'+g+'" type="application/x-shockwave-flash" width="100%" height="100%"'+h+"></embed></object>"
            }(!x(e)||!e.parent().is(a.inner))&&a.inner.append(e);
        b.trigger("beforeShow");
        a.inner.css("overflow","yes"===j?"scroll":"no"===j?"hidden":j);
        b._setDimension();
        a.wrap.removeClass("fancybox-tmp");
        a.pos=f.extend({},a.dim,b._getPosition(!0));
        b.isOpen=!1;
        b.coming=null;
        b.bindEvents();
        if(b.isOpened){
            if(c.prevMethod)b.transitions[c.prevMethod]()
                }else f(".fancybox-wrap").not(a.wrap).stop(!0).trigger("onReset").remove();
        b.transitions[b.isOpened?a.nextMethod:a.openMethod]();
        b._preloadImages()
        }
    },
_setDimension:function(){
    var a=b.getViewport(),c=0,e=!1,d=!1,e=b.wrap,j=b.skin,g=b.inner,h=
    b.current,d=h.width,i=h.height,l=h.minWidth,t=h.minHeight,m=h.maxWidth,n=h.maxHeight,s=h.scrolling,q=h.scrollOutside?h.scrollbarWidth:0,w=h.margin,o=w[1]+w[3],p=w[0]+w[2],x,r,u,A,y,D,z,B,E;
    e.add(j).add(g).width("auto").height("auto");
    w=j.outerWidth(!0)-j.width();
    x=j.outerHeight(!0)-j.height();
    r=o+w;
    u=p+x;
    A=C(d)?(a.w-r)*k(d)/100:d;
    y=C(i)?(a.h-u)*k(i)/100:i;
    if("iframe"===h.type){
        if(E=h.content,h.autoHeight&&1===E.data("ready"))try{
            E[0].contentWindow.document.location&&(g.width(A).height(9999),D=E.contents().find("body"),
                q&&D.css("overflow-x","hidden"),y=D.height())
            }catch(F){}
        }else if(h.autoWidth||h.autoHeight)g.addClass("fancybox-tmp"),h.autoWidth||g.width(A),h.autoHeight||g.height(y),h.autoWidth&&(A=g.width()),h.autoHeight&&(y=g.height()),g.removeClass("fancybox-tmp");
d=k(A);
i=k(y);
B=A/y;
l=k(C(l)?k(l,"w")-r:l);
m=k(C(m)?k(m,"w")-r:m);
t=k(C(t)?k(t,"h")-u:t);
n=k(C(n)?k(n,"h")-u:n);
D=m;
z=n;
o=a.w-o;
p=a.h-p;
if(h.aspectRatio){
    if(d>m&&(d=m,i=d/B),i>n&&(i=n,d=i*B),d<l&&(d=l,i=d/B),i<t)i=t,d=i*B
        }else d=Math.max(l,Math.min(d,
    m)),i=Math.max(t,Math.min(i,n));
if(h.fitToView)if(m=Math.min(a.w-r,m),n=Math.min(a.h-u,n),g.width(k(d)).height(k(i)),e.width(k(d+w)),a=e.width(),r=e.height(),h.aspectRatio)for(;(a>o||r>p)&&(d>l&&i>t)&&!(19<c++);)i=Math.max(t,Math.min(n,i-10)),d=i*B,d<l&&(d=l,i=d/B),d>m&&(d=m,i=d/B),g.width(k(d)).height(k(i)),e.width(k(d+w)),a=e.width(),r=e.height();else d=Math.max(l,Math.min(d,d-(a-o))),i=Math.max(t,Math.min(i,i-(r-p)));
q&&("auto"===s&&i<y&&d+w+q<o)&&(d+=q);
g.width(k(d)).height(k(i));
e.width(k(d+
    w));
a=e.width();
r=e.height();
e=(a>o||r>p)&&d>l&&i>t;
d=h.aspectRatio?d<D&&i<z&&d<A&&i<y:(d<D||i<z)&&(d<A||i<y);
f.extend(h,{
    dim:{
        width:v(a),
        height:v(r)
        },
    origWidth:A,
    origHeight:y,
    canShrink:e,
    canExpand:d,
    wPadding:w,
    hPadding:x,
    wrapSpace:r-j.outerHeight(!0),
    skinSpace:j.height()-i
    });
!E&&(h.autoHeight&&i>t&&i<n&&!d)&&g.height("auto")
},
_getPosition:function(a){
    var c=b.current,e=b.getViewport(),d=c.margin,f=b.wrap.width()+d[1]+d[3],g=b.wrap.height()+d[0]+d[2],d={
        position:"absolute",
        top:d[0],
        left:d[3]
        };
        
    c.autoCenter&&
    c.fixed&&!a&&g<=e.h&&f<=e.w?d.position="fixed":c.locked||(d.top+=e.y,d.left+=e.x);
    d.top=v(Math.max(d.top,d.top+(e.h-g)*c.topRatio));
    d.left=v(Math.max(d.left,d.left+(e.w-f)*c.leftRatio));
    return d
    },
_afterZoomIn:function(){
    var a=b.current;
    a&&((b.isOpen=b.isOpened=!0,b.wrap.addClass("fancybox-opened").css("overflow","visible"),b.reposition(),(a.closeClick||a.nextClick)&&b.inner.css("cursor","pointer").bind("click.fb",function(c){
        if(!f(c.target).is("a")&&!f(c.target).parent().is("a"))b[a.closeClick?"close":
            "next"]()
            }),a.closeBtn&&f(a.tpl.closeBtn).appendTo(b.skin).bind("click.fb",b.close),a.arrows&&1<b.group.length&&((a.loop||0<a.index)&&f(a.tpl.prev).appendTo(b.outer).bind("click.fb",b.prev),(a.loop||a.index<b.group.length-1)&&f(a.tpl.next).appendTo(b.outer).bind("click.fb",b.next)),b.trigger("afterShow"),!a.loop&&a.index===a.group.length-1)?b.play(!1):b.opts.autoPlay&&!b.player.isActive&&(b.opts.autoPlay=!1,b.play()))
    },
_afterZoomOut:function(){
    var a=b.current;
    f(".fancybox-wrap").stop(!0).trigger("onReset").remove();
    f.extend(b,{
        group:{},
        opts:{},
        router:!1,
        current:null,
        isActive:!1,
        isOpened:!1,
        isOpen:!1,
        isClosing:!1,
        wrap:null,
        skin:null,
        outer:null,
        inner:null
    });
    b.trigger("afterClose",a)
    }
});
b.transitions={
    getOrigPosition:function(){
        var a=b.current,c=a.element,e=a.orig,d={},f=50,g=50,h=a.hPadding,i=a.wPadding,l=b.getViewport();
        !e&&(a.isDom&&c.is(":visible"))&&(e=c.find("img:first"),e.length||(e=c));
        x(e)?(d=e.offset(),e.is("img")&&(f=e.outerWidth(),g=e.outerHeight())):(d.top=l.y+(l.h-g)*a.topRatio,d.left=l.x+(l.w-f)*
            a.leftRatio);
        a.locked&&(d.top-=l.y,d.left-=l.x);
        return d={
            top:v(d.top-h*a.topRatio),
            left:v(d.left-i*a.leftRatio),
            width:v(f+i),
            height:v(g+h)
            }
        },
step:function(a,c){
    var e,d,f=c.prop;
    d=b.current;
    var g=d.wrapSpace,h=d.skinSpace;
    if("width"===f||"height"===f)e=c.end===c.start?1:(a-c.start)/(c.end-c.start),b.isClosing&&(e=1-e),d="width"===f?d.wPadding:d.hPadding,d=a-d,b.skin[f](k("width"===f?d:d-g*e)),b.inner[f](k("width"===f?d:d-g*e-h*e))
        },
zoomIn:function(){
    var a=b.current,c=a.pos,e=a.openEffect,d="elastic"===
    e,j=f.extend({
        opacity:1
    },c);
    delete j.position;
    d?(c=this.getOrigPosition(),a.openOpacity&&(c.opacity=0.1)):"fade"===e&&(c.opacity=0.1);
    b.wrap.css(c).animate(j,{
        duration:"none"===e?0:a.openSpeed,
        easing:a.openEasing,
        step:d?this.step:null,
        complete:b._afterZoomIn
        })
    },
zoomOut:function(){
    var a=b.current,c=a.closeEffect,e="elastic"===c,d={
        opacity:0.1
    };
    
    e&&(d=this.getOrigPosition(),a.closeOpacity&&(d.opacity=0.1));
    b.wrap.animate(d,{
        duration:"none"===c?0:a.closeSpeed,
        easing:a.closeEasing,
        step:e?this.step:null,
        complete:b._afterZoomOut
        })
    },
changeIn:function(){
    var a=b.current,c=a.nextEffect,e=a.pos,d={
        opacity:1
    },f=b.direction,g;
    e.opacity=0.1;
    "elastic"===c&&(g="down"===f||"up"===f?"top":"left","down"===f||"right"===f?(e[g]=v(k(e[g])-200),d[g]="+=200px"):(e[g]=v(k(e[g])+200),d[g]="-=200px"));
    "none"===c?b._afterZoomIn():b.wrap.css(e).animate(d,{
        duration:a.nextSpeed,
        easing:a.nextEasing,
        complete:b._afterZoomIn
        })
    },
changeOut:function(){
    var a=b.previous,c=a.prevEffect,e={
        opacity:0.1
    },d=b.direction;
    "elastic"===c&&
    (e["down"===d||"up"===d?"top":"left"]=("up"===d||"left"===d?"-":"+")+"=200px");
    a.wrap.animate(e,{
        duration:"none"===c?0:a.prevSpeed,
        easing:a.prevEasing,
        complete:function(){
            f(this).trigger("onReset").remove()
            }
        })
}
};

b.helpers.overlay={
    overlay:null,
    update:function(){
        var a="100%",b;
        this.overlay.width(a).height("100%");
        f.browser.msie?(b=Math.max(p.documentElement.offsetWidth,p.body.offsetWidth),n.width()>b&&(a=n.width())):n.width()>o.width()&&(a=n.width());
        this.overlay.width(a).height(n.height())
        },
    onReady:function(a,
        b){
        f(".fancybox-overlay").stop(!0,!0);
        this.overlay||f.extend(this,{
            overlay:f('<div class="fancybox-overlay"></div>').appendTo(b.parent),
            margin:n.height()>o.height()||"scroll"===f("body").css("overflow-y")?f("body").css("margin-right"):!1,
            el:p.all&&!p.querySelector?f("html"):f("body")
            });
        b.fixed&&!m&&(this.overlay.addClass("fancybox-overlay-fixed"),b.autoCenter&&(this.overlay.append(b.wrap),b.locked=this.overlay));
        !0===a.showEarly&&this.beforeShow.apply(this,arguments)
        },
    beforeShow:function(a,c){
        var e=
        this.overlay.unbind(".fb").width("auto").height("auto").css(a.css);
        a.closeClick&&e.bind("click.fb",function(a){
            f(a.target).hasClass("fancybox-overlay")&&b.close()
            });
        c.fixed&&!m?c.locked&&(this.el.addClass("fancybox-lock"),!1!==this.margin&&f("body").css("margin-right",k(this.margin)+c.scrollbarWidth)):this.update();
        e.show()
        },
    onUpdate:function(a,b){
        (!b.fixed||m)&&this.update()
        },
    afterClose:function(a){
        var c=this,a=a.speedOut||0;
        c.overlay&&!b.isActive&&c.overlay.fadeOut(a||0,function(){
            f("body").css("margin-right",
                c.margin);
            c.el.removeClass("fancybox-lock");
            c.overlay.remove();
            c.overlay=null
            })
        }
    };

b.helpers.title={
    beforeShow:function(a){
        var c=b.current.title,e=a.type;
        if(s(c)&&""!==f.trim(c)){
            c=f('<div class="fancybox-title fancybox-title-'+e+'-wrap">'+c+"</div>");
            switch(e){
                case "inside":
                    e=b.skin;
                    break;
                case "outside":
                    e=b.wrap;
                    break;
                case "over":
                    e=b.inner;
                    break;
                default:
                    e=b.skin,c.appendTo("body").width(c.width()).wrapInner('<span class="child"></span>'),b.current.margin[2]+=Math.abs(k(c.css("margin-bottom")))
                    }
                    "top"===
            a.position?c.prependTo(e):c.appendTo(e)
            }
        }
};

f.fn.fancybox=function(a){
    var c,e=f(this),d=this.selector||"",j=function(g){
        var h=f(this).blur(),i=c,j,k;
        !g.ctrlKey&&(!g.altKey&&!g.shiftKey&&!g.metaKey)&&!h.is(".fancybox-wrap")&&(j=a.groupAttr||"data-fancybox-group",k=h.attr(j),k||(j="rel",k=h.get(0)[j]),k&&(""!==k&&"nofollow"!==k)&&(h=d.length?f(d):e,h=h.filter("["+j+'="'+k+'"]'),i=h.index(this)),a.index=i,!1!==b.open(h,a)&&g.preventDefault())
        },a=a||{};
    
    c=a.index||0;
    !d||!1===a.live?e.unbind("click.fb-start").bind("click.fb-start",
        j):n.undelegate(d,"click.fb-start").delegate(d+":not('.fancybox-item, .fancybox-nav')","click.fb-start",j);
    return this
    };
    
n.ready(function(){
    f.scrollbarWidth===q&&(f.scrollbarWidth=function(){
        var a=f('<div style="width:50px;height:50px;overflow:auto"><div/></div>').appendTo("body"),b=a.children(),b=b.innerWidth()-b.height(99).innerWidth();
        a.remove();
        return b
        });
    if(f.support.fixedPosition===q){
        var a=f.support,c=f('<div style="position:fixed;top:20px;"></div>').appendTo("body"),e=20===c[0].offsetTop||
        15===c[0].offsetTop;
        c.remove();
        a.fixedPosition=e
        }
        f.extend(b.defaults,{
        scrollbarWidth:f.scrollbarWidth(),
        fixed:f.support.fixedPosition,
        parent:f("body")
        })
    })
})(window,document,jQuery);