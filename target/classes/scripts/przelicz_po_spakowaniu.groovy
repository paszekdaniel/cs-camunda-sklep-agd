pozostaleZakupy = execution.getVariable('pozostaleZakupy')
pozostaleZakupy.remove(0)

if (pozostaleZakupy.size() > 0) {
    execution.setVariable('currProduct', pozostaleZakupy[0]['product'])
    execution.setVariable('currCount', pozostaleZakupy[0]['count'])
}


execution.setVariable('pozostaleZakupy', pozostaleZakupy)
