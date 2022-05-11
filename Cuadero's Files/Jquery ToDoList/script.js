$(function() {
  $( "#sortable-1" ).sortable();
});
$(document).ready(
  function () {
    $('#btn').click(
      function () {
        var toAdd = $('input[name=li]').val();
        if (toAdd === '') {
          alert("Please input to do list")
        } else { $('ol').append('<li>'  + toAdd + '<button  class="btn"  id="button">x</button></li><br>'); }


      });



    $(document).on('click', '.btn', function () {
      $(this).addClass('strike').parent('li').fadeOut('slow').addClass('strike');
    });

    $('input').focus(function () {
      $(this).val(' ');
    });

    // $('ol').sortable();
    // $(" input[name=li] ").keypress(function () {
    //   $("span").text(i == 13);
    // });
});

