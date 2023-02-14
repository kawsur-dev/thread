<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Form Submission Page</title>
</head>
<body>

	<h1>Form Page</h1>

	<?php
		
		echo "First Name: " . $_POST['firstname'];
		echo "<br>";
		echo "Last Name: " . $_POST['lastname'];
	?>

</body>
</html>