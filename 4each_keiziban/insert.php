<?php

mb_internal_encoding("utf8");

$pdo = new PDO("mysql:dbname=keiziban1;host=localhost;","root","mysql");

$pdo->exec("insert into 4each_keiziban(handlename,title,comments)values('".$_POST['handlename']."','".$_POST['title']."','".$_POST['comments']."');");

header("Location:http://localhost/4each_keiziban/index.php");

  ?>

