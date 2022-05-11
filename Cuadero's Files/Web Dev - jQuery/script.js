// Background Changing Design
function color(z) {
  var a = getComputedStyle(z);
  var b = a.backgroundColor;
  document.getElementsByTagName("BODY")[0].style.backgroundColor = b;
}
// My color Pallete 
$(document).ready(function () {
  $("#box").click(function () {
    $("#sq").css("background", "red",);
  });
  $("#box1").click(function () {
    $("#sq").css("background", "rgba(247, 178, 3, 0.715)");
  });
  $("#box2").click(function () {
    $("#sq").css("background", "rgb(30, 162, 41)");
  });
  $("#box3").click(function () {
    $("#sq").css("background", "rgb(47, 11, 230)");
  });
  $("#box4").click(function () {
    $("#sq").css("background", "rgb(255, 0, 157)");
  });
  $("#box5").click(function () {
    $("#sq").css("background", "rgb(247, 235, 3)");
  });
  $("#box6").click(function () {
    $("#sq").css("background", "rgb(86, 255, 64)");
  });
  $("#box7").click(function () {
    $("#sq").css("background", "rgb(41, 133, 253)");
  });
  $("#box8").click(function () {
    $("#sq").css("background", "rgb(247, 162, 3)");
  });
  $("#box9").click(function () {
    $("#sq").css("background", "rgba(249, 255, 65, 0.685)");
  });
  $("#box10").click(function () {
    $("#sq").css("background", "rgb(59, 250, 145)");
  });
  $("#box11").click(function () {
    $("#sq").css("background", "rgb(190, 40, 250)");
  });

});


/*Circle*/

$(document).ready(function () {
  $(".circle").click(function () {
    $("#sq").removeClass().addClass("circle").css('margin-left', '46%', 'margin-top', '40%', ' position', 'absolute;');

  });
});
/* Triangle*/

$(document).ready(function () {
  $(".triangle-up").click(function () {
    $("#sq").removeClass().addClass("triangle-up").css('margin-left', '46%', 'backgroundColor', 'red', 'margin-top', '40%', ' position', 'absolute;');
  });

});

/*Octagon*/

$(document).ready(function () {
  $(".octagon").click(function () {
    $("#sq").removeClass().addClass("octagon").css('margin-left', '46%', 'margin-top', '40%', ' position', 'absolute;', 'backgroundColor', 'red',);

  });

});

/*Heart*/

$(document).ready(function () {
  $(".heart").click(function () {
    $("#sq").removeClass().addClass("heart").css('margin-left', '46%', 'margin-top', '40%', ' position', 'absolute;', 'backgroundColor', 'red',);

  });

});

/*Yin- Yang*/

$(document).ready(function () {
  $(".yin-yang").click(function () {
    $("#sq").removeClass().addClass("yin-yang").css('margin-left', '46%', 'backgroundColor', 'red', 'margin-top', '40%', ' position', 'absolute;');

  });
});

/*Moon*/

$(document).ready(function () {
  $(".moon").click(function () {
    $("#sq").removeClass().addClass("moon").css('margin-left', '52%', 'margin-top', '20%', 'backgroundColor', 'red', ' position', 'absolute;');

  });
});

/*Star*/

$(document).ready(function () {
  $(".cross").click(function () {
    $("#sq").removeClass().addClass("cross").css('margin-left', '52%', 'backgroundColor', 'red', 'margin-top', '20%', ' position', 'absolute;');
  });
});

/*Color : CSS Props Changes Details*/

var flag = true;

$(document).ready(function () {
  $("#box").click(function () {
    $(".sq").css("background", "red", 'border', '20px solid transparent;');
    $("#sq").addClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box5");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }

  });

  $("#box1").click(function () {
    $(".sq").css("background", "rgb(247, 178, 3, 0.715)", 'border', '20px solid transparent;');
    $("#sq").addClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box5");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box1");

    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }



  });

  $("#box2").click(function () {
    $(".sq").css("background", "rgb(30, 162, 41)", 'border', '20px solid transparent;');
    $("#sq").addClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }



  });

  $("#box3").click(function () {
    $(".sq").css("background", "rrgb(47, 11, 230)", 'border', '20px solid transparent;');
    $("#sq").addClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box5");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }
  });
  $("#box4").click(function () {
    $(".sq").css("background", "rgb(255, 0, 157)", 'border', '20px solid transparent;');
    $("#sq").addClass("box4");
    $("#sq").removeClass("box5");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }
  });
  $("#box5").click(function () {
    $(".sq").css("background", "rgb(247, 235, 3)", 'border', '20px solid transparent;');
    $("#sq").addClass("box5");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }
  });
  $("#box6").click(function () {
    $(".sq").css("background", "rgb(86, 255, 64)", 'border', '20px solid transparent;');
    $("#sq").addClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box5");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }
  });
  $("#box7").click(function () {
    $(".sq").css("background", "rgb(41, 133, 253)", 'border', '20px solid transparent;');
    $("#sq").addClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box5");
    $("#sq").removeClass("box6");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }
  });
  $("#box8").click(function () {
    $(".sq").css("background", "rgb(247, 162, 3)", 'border', '20px solid transparent;');
    $("#sq").addClass("box8");
    $("#sq").removeClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box5");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }
  });
  $("#box9").click(function () {
    $(".sq").css("background", "rgba(249, 255, 65, 0.685)", 'border', '20px solid transparent;');
    $("#sq").addClass("box9");
    $("#sq").removeClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box5");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }
  });
  $("#box10").click(function () {
    $(".sq").css("background", "rgb(59, 250, 145)", 'border', '20px solid transparent;');
    $("#sq").addClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box5");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }
  });
  $("#box11").click(function () {
    $(".sq").css("background", "rgb(190, 40, 250)", 'border', '20px solid transparent;');
    $("#sq").addClass("box10");
    $("#sq").removeClass("box11");
    $("#sq").removeClass("box");
    $("#sq").removeClass("box1");
    $("#sq").removeClass("box2");
    $("#sq").removeClass("box3");
    $("#sq").removeClass("box4");
    $("#sq").removeClass("box5");
    $("#sq").removeClass("box6");
    $("#sq").removeClass("box7");
    $("#sq").removeClass("box8");
    $("#sq").removeClass("box9");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '20px solid transparent;');

      flag = false;
    } else {
      // $("#column2").empty();
    }
  });
});

var flag = true;

$(document).ready(function () {
  $(".heart").click(function () {
    $(".sq").css("background", "black", 'border', '20px solid transparent;');
    $(".heart").addClass(".heart").css( 'border', '20px solid transparent;');
    $("#sq").removeClass("octagon");
    $("#sq").removeClass("moon");
    $("#sq").removeClass("triangle-up");
    $("#sq").removeClass("circle");
    $("#sq").removeClass("cross");
    $("#sq").removeClass("yin-yang");
    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '10px solid transparent;');

      flag = false;
    } else {
      // $("#column").empty();
    }

  });
});
var flag = true;

$(document).ready(function () {
  $(".octagon").click(function () {
    $(".sq").css("background", "black", 'border', '20px solid transparent;');
    $(".octagon").addClass(".octagon").css( 'border', '20px solid transparent;');
    $("#sq").removeClass("moon");
    $("#sq").removeClass("triangle-up");
    $("#sq").removeClass("circle");
    $("#sq").removeClass("cross");
    $("#sq").removeClass("yin-yang");
    $("#sq").removeClass("heart");

    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '09px solid transparent;');

      flag = false;
    } else {
      // $("#column").empty();
    }

  });
});
var flag = true;

$(document).ready(function () {
  $(".moon").click(function () {
    $(".sq").css("background", "black", 'border', '20px solid transparent;');
    $(".moon").addClass(".moon").css( 'border', '20px solid transparent;');
    $("#sq").removeClass("triangle-up");
    $("#sq").removeClass("circle");
    $("#sq").removeClass("cross");
    $("#sq").removeClass("yin-yang");
    $("#sq").removeClass("heart");
    $("#sq").removeClass("octagon");


    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '8px solid transparent;');

      flag = false;
    } else {
      // $("#column").empty();
    }

  });
});
var flag = true;

$(document).ready(function () {
  $(".triangle-up").click(function () {
    $(".sq").css("background", "black", 'border', '20px solid transparent;');
    $(".triangle-up").addClass(".triangle-up").css( 'border', '20px solid transparent;');
    $("#sq").removeClass("circle");
    $("#sq").removeClass("cross");
    $("#sq").removeClass("yin-yang");
    $("#sq").removeClass("heart");
    $("#sq").removeClass("octagon");
    $("#sq").removeClass("moon");



    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '10px solid transparent;');

      flag = false;
    } else {
      // $("#column").empty();
    }

  });
});

var flag = true;

$(document).ready(function () {
  $(".circle").click(function () {
    $(".sq").css("background", "black", 'border', '20px solid transparent;');
    $(".circle").addClass(".circle").css( 'border', '15px solid transparent;');
    $("#sq").removeClass("cross");
    $("#sq").removeClass("yin-yang");
    $("#sq").removeClass("heart");
    $("#sq").removeClass("octagon");
    $("#sq").removeClass("moon");
    $("#sq").removeClass("triangle-up");




    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '13px solid transparent;');

      flag = false;
    } else {
      // $("#column").empty();
    }

  });
});
var flag = true;

$(document).ready(function () {
  $(".cross").click(function () {
    $(".sq").css("background", "black", 'border', '20px solid transparent;');
    $(".cross").addClass(".cross").css( 'border', '9px solid transparent;');
    $("#sq").removeClass("yin-yang");
    $("#sq").removeClass("heart");
    $("#sq").removeClass("octagon");
    $("#sq").removeClass("moon");
    $("#sq").removeClass("triangle-up");
    $("#sq").removeClass("circle");





    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '9px solid transparent;');

      flag = false;
    } else {
      // $("#column").empty();
    }

  });
});

var flag = true;

$(document).ready(function () {
  $(".yin-yang").click(function () {
    $(".sq").css("background", "black", 'border', '20px solid transparent;');
    $(".yin-yang").addClass(".yin-yang").css( 'border', '11px solid transparent;');
    $("#sq").removeClass("heart");
    $("#sq").removeClass("octagon");
    $("#sq").removeClass("moon");
    $("#sq").removeClass("triangle-up");
    $("#sq").removeClass("circle");
    $("#sq").removeClass("cross");






    flag = true;
    $("#column2").empty();
    if (flag) {
      $("#column2").append($("#sq").attr("style") + 'border', '10px solid transparent;');

      flag = false;
    } else {
      // $("#column").empty();
    }

  });
});





