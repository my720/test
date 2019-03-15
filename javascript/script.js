document.write("(問1)<br>");

document.write("ココカラ───────<br>");

var i = 1;

while(i <= 5){
  document.write("★")
  i++
}

document.write("<br>")

document.write("───────ココマデ");

document.write("<br>");

document.write("(問2)<br>");

document.write("ココカラ───────<br>");

var i = 1;

while(i <= 2){
  
  document.write("★★★<br>");

  i++;

}

document.write("───────ココマデ");

document.write("<br>");

document.write("(問3)<br>");

document.write("ココカラ───────<br>");

for(var star1 = 1;star1 <= 2; star1++){
  
  for(var star2 = 1;star2 <= 5; star2++){
    
    document.write("☆");
  
  }
 
  document.write("<br>");
  
}

document.write("───────ココマデ");

document.write("<br>");

document.write("(問4)<br>");

document.write("ココカラ───────<br>");

for(var star1 = 1;star1 <= 4; star1++){
  
  for(var star2 = 1;star2 <= 5; star2++){
    
    document.write("★");
  
  }
 
  document.write("<br>");
  
}

document.write("───────ココマデ");

document.write("<br>");

document.write("(問5)<br>");

document.write("ココカラ───────<br>");

for(var star1 = 1;star1 <= 4; star1++){
  
  for(var star2 = 1;star2 <= 3; star2++){
    
    document.write("★");
  
  }
 
  document.write("<br>");
  
}

document.write("───────ココマデ");

document.write("<br>");

document.write("(問6)<br>");

document.write("ココカラ───────<br>");

for(var star1 = 1;star1 <= 3; star1++){
  
  for(var star2 = 1;star2 <= 3; star2++){
    
    if(star2 % 2 == 0){
      
      document.write("☆");
    
    }else{
      
      document.write("★");
    
    }
  
  }
 
  document.write("<br>");
  
}

document.write("───────ココマデ");

document.write("<br>");

document.write("(問7)<br>");

document.write("ココカラ───────<br>");

for(var star1 = 1;star1 <= 4; star1++){
  
  for(var star2 = 1;star2 <= 5; star2++){
    
   if(star2 % 2 == 0){
      
      document.write("☆");
    
    }else{
      
      document.write("★");
    
    }
  
  }
 
  document.write("<br>");
  
}

document.write("───────ココマデ");

document.write("<br>");

document.write("(問8)<br>");

document.write("ココカラ───────<br>");

for(var star1 = 1;star1 <= 5; star1++){
  
  for(var star2 = 1;star2 <= star1; star2++){
    
    document.write("☆");
  
  }
 
  document.write("<br>");
  
}

document.write("───────ココマデ");

document.write("<h2>関数</h2> <br>");

function circleArea(r,π){
  return "面積は"　+ r * r * π + "cm2です。";
}

document.write("問1<br>");

document.write("半径5cmの円の" +circleArea(5,3.14) + "<br>");

document.write("半径7cmの円の" +circleArea(7,3.14) + "<br>");

document.write("半径10cmの円の" +circleArea(10,3.14) + 
               "<br>");

document.write("<br>");

function totalFee(fee1,fee2){
  return "グループの合計金額は"　+ (500 * fee1 + 200 * fee2) + "円です。";
}

document.write("問2<br>");

document.write("A" + totalFee(2,4) + "<br>");

document.write("B" + totalFee(1,5) + "<br>");

document.write("C" + totalFee(3,7) + "<br>");