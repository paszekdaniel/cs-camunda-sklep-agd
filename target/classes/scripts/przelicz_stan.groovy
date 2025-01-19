stan = execution.getVariable('stan')
wybrany_sklep = execution.getVariable('wybrany_sklep')

zakupy = execution.getVariable('zakupy')

stanSklepu = stan[wybrany_sklep]

products = []
zakupy.each { k, v ->
    products.add([product: k, count: v])
}

execution.setVariable('currProduct', products[0]['product'])
execution.setVariable('currCount', products[0]['count'])

execution.setVariable('pozostaleZakupy', products)
name = products[0]['product']
execution.setVariable('stanProductCount', stanSklepu[name as String])