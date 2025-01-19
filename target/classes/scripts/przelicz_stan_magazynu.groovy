stan = execution.getVariable('stanMagazyn')

zakupy = execution.getVariable('zakupy')

products = []
zakupy.each { k, v ->
    products.add([product: k, count: v])
}

execution.setVariable('currProduct', products[0]['product'])
execution.setVariable('currCount', products[0]['count'])

execution.setVariable('pozostaleZakupy', products)

name = products[0]['product']
execution.setVariable('stanProductCount', stan[name as String])