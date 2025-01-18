pozostaleZakupy = execution.getVariable('pozostaleZakupy')

execution.setVariable('currProduct', pozostaleZakupy[0]['product'])
execution.setVariable('currCount', pozostaleZakupy[0]['count'])


pozostaleZakupy.remove(0)
execution.setVariable('pozostaleZakupy', pozostaleZakupy)
