<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sucesso</title>
</head>
<body>

${empty user ? "usuario n�o cadastrado": ""}


Ol� ${user.sexo == "masc" ? "Sr." : "Sra." } ${user.nome} Seu cadastro foi realizado com Sucesso:
ser� enviado um email para ${user.email}. 





</body>
</html>