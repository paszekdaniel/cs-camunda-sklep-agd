stan = execution.getVariable('stan')
wybrany_sklep = execution.getVariable('wybrany_sklep')

zakupy = execution.getVariable('zakupy')

stanSklepu = stan[wybrany_sklep]

res = []

stan.each { key, value ->
    res.add([product: key, count: value])
}
execution.setVariable('stanTable', res)

products = []
zakupy.each { k, v ->
    products.add([product: k, count: v])
}

execution.setVariable('currProduct', products[0]['product'])
execution.setVariable('currCount', products[0]['count'])

products.remove(0)
execution.setVariable('pozostaleZakupy', products)