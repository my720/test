<!DOCTYPE html>
<html lang = "ja">
  <head>
   <meta charset="UTF-8">
   <title>4each掲示板</title>
   <link rel="stylesheet" type ="text/css" href="style.css"> 
  </head>
  <body>
    
    <?php
    
    mb_internal_encoding("utf8");

    $pdo = new PDO("mysql:dbname=keiziban1;host=localhost;","root","mysql");
    
    $stmt = $pdo->query("select * from 4each_keiziban");
    
    ?>
    
    <header>
     
      <div class="logo"><img src="4eachblog_logo.jpg"></div>
      
      <ul>
       <li>トップ</li>
       <li>プロフィール</li>
       <li>4eachについて</li>
       <li>登録フォーム</li>
       <li>問い合わせ</li>
       <li>その他</li>
      </ul>
    </header>
    <main>
     <div class="main-container">
      <div class="left">
       
       <h2>プログラミングに役立つ書籍</h2>
        
        <div class="box1">
          
          <h3>入力フォーム</h3>
          
          <form method = "post" action="insert.php">
  
       
    
            <div class="form">
     
     
              <label>ハンドルネーム</label>
    　
     
              <br>
      
     
              <input type="text" class = "text" size ="35" name = "handlename">
     
    
            </div>
    
        
            <br>
    
       
            <div>
    
     
              <label>タイトル</label>
    
     
              <br>
      
     
              <input type="text" class= "text" size = "35" name = "title"> 
    
    
            </div>
    
       
            <br>
    
    
       
            <div>
    
      
              <label>コメント</label>
       
      
              <br>
       
      
              <textarea col="35" rows="7" name="comments"></textarea>
     
     
            </div>
    
       
            <br>
    
       
            <div>
    
      
              <input type="submit" class = "submit" value="投稿する">
    
     
            </div>
    
          
          
          </form>
        
        
        </div>
        
        <?php
        
        while($row = $stmt->fetch()){
          
        
        
        echo "<div class='box2'>";
        
        echo "<h3>".$row['title']."</h3>";
          
        echo "<div class='box2_container'>";
          
        echo $row['comments'];
          
        echo "<div class='handlename'>posted by ".$row['handlename']."</div>";
          
        echo "</div>";
        
        echo "</div>";
          
        }
        
        ?>
        
        <?php
        
        while($row = $stmt->fetch()){
          
        
        
        echo "<div class='box3'>";
        
        echo "<h3>".$row['title']."</h3>";
          
        echo "<div class='box3_container'>";
          
        echo $row['comments'];
          
        echo "<div class='handlename'>posted by ".$row['handlename']."</div>";
          
        echo "</div>";
        
        echo "</div>";
          
        }
        
        ?>
       
       </div>
       <div class="right">
       <div class="manu1">
        <h3>人気の記事</h3>
        <ul>
         <li>PHPオススメ本</li>
         <li>PHP MyAdminの使い方</li>
         <li>今人気のエディタTop5</li>
         <li>HTMLの基礎</li>
        </ul>
        </div>
        <div class="manu1">
        <h3>オススメリンク</h3>
        <ul>
         <li>インターノウス株式会社</li>
         <li>XAMPPのダウンロード</li>
         <li>Eclipseのダウンロード</li>
         <li>Braketsのダウンロード</li>
        </ul>
        </div>
        <div class="manu1">
        <h3>カテゴリ</h3>
        <ul>
         <li>HTML</li>
         <li>PHP</li>
         <li>MySQL</li>
         <li>JacaScript</li>
        </ul>
        </div>
       </div>
      </div>
    </main>
    <footer>
     copyright internous | 4each blog is the one which provides A to Z about programming.
    </footer>
  </body>