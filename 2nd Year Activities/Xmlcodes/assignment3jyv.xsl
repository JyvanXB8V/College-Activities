<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<!-- Match the root node -->
	<xsl:template match="/enterprise">
		<html>
			<head>
				<title>Product Table</title>
				<style>

                    body {
                        display: flex;
                        flex-direction: column;
                        align-items: center; 
                    }
                    table {
                        width: 60%;
                        border-collapse: collapse;
                        margin: 20px auto; 
                        font-family: Arial, sans-serif;
                    }
                    th, td {
                        border: 1px solid #ccc;
                        padding: 8px;
                        text-align: center;
                    }

                    th {
                        background-color: #618685;
                    }
                    h2 {
                        text-align: center; 
                    } 
                </style>
			</head>
			<body>
				<h2>
					<xsl:value-of select="company"/>
				</h2>
				<h3 style="text-align:center">Available Products</h3>
				<table>
					<tr>
						<th>Product ID</th>
						<th>Name</th>
						<th>Category</th>
						<th>Price</th>
						<th>Availability</th>
					</tr>
					<xsl:for-each select="products/product">
						<tr>
							<td>
								<xsl:value-of select="id"/>
							</td>
							<td>
								<xsl:value-of select="name"/>
							</td>
							<td>
								<xsl:value-of select="category"/>
							</td>
							<td>
								<xsl:value-of select="price"/>
							</td>
							<td>
								<xsl:value-of select="availability"/>
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>