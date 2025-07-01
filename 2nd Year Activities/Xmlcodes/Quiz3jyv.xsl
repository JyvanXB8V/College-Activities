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
                <h2 style="text-align:center">Jyvan Tech Shop</h2>
				<h2 style="text-align:center">Latest Inventory Report</h2>
                <table>
				<h2 style="text-align:center">Monitors</h2>
                    <tr>
                        <th>Product</th>
                        <th>Brand</th>
                        <th>Model</th>
						<th>Price</th>
                    </tr>
                    <xsl:for-each select="peripherals/monitors/inventory">
						<xsl:sort select="number(translate(income, ',', ''))" data-type="number" order="descending"/>
						<xsl:sort select="date" data-type="text" order="descending"/>
                        <tr>
                            <td><xsl:value-of select="product"/></td>
                            <td><xsl:value-of select="brand"/></td>
                            <td><xsl:value-of select="model"/></td>
							<td><xsl:value-of select="price"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
				
				<table>
				<h2 style="text-align:center">Keyboards</h2>
                    <tr>
                        <th>Product</th>
                        <th>Brand</th>
                        <th>Model</th>
						<th>Price</th>
                    </tr>
                    <xsl:for-each select="peripherals/keyboards/inventory">
						<xsl:sort select="number(translate(income, ',', ''))" data-type="number" order="descending"/>
						<xsl:sort select="date" data-type="text" order="descending"/>
                        <tr>
                            <td><xsl:value-of select="product"/></td>
                            <td><xsl:value-of select="brand"/></td>
                            <td><xsl:value-of select="model"/></td>
							<td><xsl:value-of select="price"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
				
				<table>
				<h2 style="text-align:center">Mouses</h2>
                    <tr>
                        <th>Product</th>
                        <th>Brand</th>
                        <th>Model</th>
						<th>Price</th>
                    </tr>
                    <xsl:for-each select="peripherals/mouses/inventory">
						<xsl:sort select="number(translate(income, ',', ''))" data-type="number" order="descending"/>
						<xsl:sort select="date" data-type="text" order="descending"/>
                        <tr>
                            <td><xsl:value-of select="product"/></td>
                            <td><xsl:value-of select="brand"/></td>
                            <td><xsl:value-of select="model"/></td>
							<td><xsl:value-of select="price"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
				
				<table>
				<h2 style="text-align:center">Headsets</h2>
                    <tr>
                        <th>Product</th>
                        <th>Brand</th>
                        <th>Model</th>
						<th>Price</th>
                    </tr>
                    <xsl:for-each select="peripherals/headsets/inventory">
						<xsl:sort select="number(translate(income, ',', ''))" data-type="number" order="descending"/>
						<xsl:sort select="date" data-type="text" order="descending"/>
                        <tr>
                            <td><xsl:value-of select="product"/></td>
                            <td><xsl:value-of select="brand"/></td>
                            <td><xsl:value-of select="model"/></td>
							<td><xsl:value-of select="price"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>