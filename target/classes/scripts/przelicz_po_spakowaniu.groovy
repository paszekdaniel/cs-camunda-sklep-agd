pozostaleZakupy = execution.getVariable('pozostaleZakupy')
pozostaleZakupy.remove(0)

if (pozostaleZakupy.size() > 0) {
    execution.setVariable('currProduct', pozostaleZakupy[0]['product'])
    execution.setVariable('currCount', pozostaleZakupy[0]['count'])

    stan = execution.getVariable('stan')
    wybrany_sklep = execution.getVariable('wybrany_sklep')
    stanSklepu = stan[wybrany_sklep]
    name = pozostaleZakupy[0]['product']
    execution.setVariable('stanProductCount', stanSklepu[name as String])
}
execution.setVariable('pozostaleZakupy', pozostaleZakupy)


