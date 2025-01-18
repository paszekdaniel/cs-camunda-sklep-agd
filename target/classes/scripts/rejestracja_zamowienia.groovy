import java.util.Random
Random random = new Random()

dostawa_do_domu = execution.getVariable('dostawa_do_domu')

wybranySklep = ''

if (dostawa_do_domu) {
    sklepy = ['Poznan', 'Warszawa', 'Krakow']
    wybranySklep = sklepy[random.nextInt(3)]
} else {
    wybranySklep = execution.getVariable('wybrany_sklep')
}
execution.setVariable('wybrany_sklep', wybranySklep)