<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina de Cadastro</title>
</head>
<body>

<h1>Cadastro</h1>

<form action="UsuarioController" method="post">
	Nome: <input type="text" name="nome"> <br/>
	E-mail: <input type="email" name="email"> <br/>
	Senha: <input type="password" name="senha"> ${msgErro}<br/>
	Sexo: <input type="text" name="sexo"><br/>
	<input type="submit" value="Enviar">

</form>

</body>
</html>