<html>
<head>
<title>Example mail</title>
</head>
<body>
<table>
	<tbody>
		<tr>
			<td>Status</td>
			<td>${mail.status}</td>
		</tr>
		<tr>
			<td>Subject</td>
			<td>${mail.subject}</td>
		</tr>
		<tr>
			<td>Content</td>
			<td>${mail.content}</td>
		</tr>
		<tr>
			<td>Account</td>
			<td><a href="${mail.accountRef}">Link</a></td>
		</tr>
	</tbody>
</table>
</body>
</html>
