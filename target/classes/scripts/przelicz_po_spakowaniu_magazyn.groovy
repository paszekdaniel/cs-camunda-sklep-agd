pozostaleZakupy = execution.getVariable('pozostaleZakupy')
pozostaleZakupy.remove(0)

if (pozostaleZakupy.size() > 0) {
    execution.setVariable('currProduct', pozostaleZakupy[0]['product'])
    execution.setVariable('currCount', pozostaleZakupy[0]['count'])

    stan = execution.getVariable('stanMagazyn')
    name = pozostaleZakupy[0]['product']
    execution.setVariable('stanProductCount', stan[name as String])
}
execution.setVariable('pozostaleZakupy', pozostaleZakupy)


