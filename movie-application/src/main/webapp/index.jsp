<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Movie App</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background: #111;
      color: #fff;
      margin: 0;
      padding: 20px;
    }
    h1 {
      text-align: center;
      color: #f39c12;
    }
    .movies {
      display: flex;
      flex-wrap: wrap;
      gap: 20px;
      justify-content: center;
    }
    .card {
      background: #222;
      border-radius: 10px;
      width: 200px;
      padding: 15px;
      box-shadow: 0 0 10px #000;
    }
    .card img {
      width: 100%;
      border-radius: 10px;
    }
    .card h3 {
      margin: 10px 0 5px;
    }
    .card p {
      font-size: 14px;
      color: #ccc;
    }
  </style>
</head>
<body>

  <h1>Movie App</h1>
  <div class="movies">
    <div class="card">
      <img src="https://via.placeholder.com/200x300" alt="Movie Poster">
      <h3>Inception</h3>
      <p>A mind-bending thriller by Christopher Nolan.</p>
    </div>
    <div class="card">
      <img src="https://via.placeholder.com/200x300" alt="Movie Poster">
      <h3>Interstellar</h3>
      <p>Journey through space and time to save humanity.</p>
    </div>
    <div class="card">
      <img src="https://via.placeholder.com/200x300" alt="Movie Poster">
      <h3>Avatar</h3>
      <p>Explore the alien world of Pandora.</p>
    </div>
  </div>

</body>
</html>

