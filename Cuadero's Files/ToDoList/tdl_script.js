$(document).ready(function(){


    $("#subtn").click(function(){
        var addItem = $("input[name=list_item]").val();
        $("ol").append("<li>"+addItem+"</li>");
    });

    $(document).on('click','li', function(){
        $(this).css( "text-decoration", "line-through" ) ;   
     });
     $(document).on('click','li', function(){
        $(this).fadeOut("slow") ;   
     });
    
    
});