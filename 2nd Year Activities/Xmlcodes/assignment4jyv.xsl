<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>Store List</title>
                <style>
                    table {
                        width: 60%;
                        border-collapse: collapse;
                        margin: 20px auto; /* Center the table */
                        font-family: Arial, sans-serif;
                    }
                    th, td {
                        border: 1px solid #ccc;
                        padding: 8px;
                        text-align: center; /* Center align text in table cells */
                    }
                    th {
                        background-color: #618685;
                    }
                </style>
            </head>
            <body>
                <h2 style="text-align:center">Jyvan Arms Corner</h2>
				<h2 style="text-align:center">Store Income Report</h2>
                <table>
                    <tr>
                        <th>Date</th>
                        <th>Income</th>
                        <th>Location</th>
                    </tr>
                    <xsl:for-each select="catalog/list/store">
						<xsl:sort select="number(translate(income, ',', ''))" data-type="number" order="descending"/>
						<xsl:sort select="date" data-type="text" order="descending"/>
                        <tr>
                            <td><xsl:value-of select="date"/></td>
                            <td><xsl:value-of select="income"/></td>
                            <td><xsl:value-of select="location"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>