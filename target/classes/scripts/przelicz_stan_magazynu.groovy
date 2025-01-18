stan = execution.getVariable('stanMagazyn')

zakupy = execution.getVariable('zakupy')
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

execution.setVariable('pozostaleZakupy', products)