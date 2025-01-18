import java.util.Random
Random random = new Random()
stan = [:]
stan['Poznan'] = [:]
stan['Warszawa'] = [:]
stan['Krakow'] = [:]

stanMagazyn = [:]

stan['Poznan']['pralka'] = random.nextInt(3) +1
stan['Poznan']['lodowka'] = random.nextInt(3)
stan['Poznan']['ekspress'] = random.nextInt(3)
stan['Poznan']['zmywarka'] = random.nextInt(3)

stan['Warszawa']['pralka'] = random.nextInt(3)
stan['Warszawa']['lodowka'] = random.nextInt(3)
stan['Warszawa']['ekspress'] = random.nextInt(3)
stan['Warszawa']['zmywarka'] = random.nextInt(3)

stan['Krakow']['pralka'] = random.nextInt(3)
stan['Krakow']['lodowka'] = random.nextInt(3)
stan['Krakow']['ekspress'] = random.nextInt(3)
stan['Krakow']['zmywarka'] = random.nextInt(3)

stanMagazyn['pralka'] = random.nextInt(10) + 1
stanMagazyn['lodowka'] = random.nextInt(10) + 1
stanMagazyn['ekspress'] = random.nextInt(10) + 1
stanMagazyn['zmywarka'] = random.nextInt(10) + 1

execution.setVariable('stan', stan)
execution.setVariable('stanMagazyn', stanMagazyn)


zakupy = execution.getVariable('dynamiclist_zakup')
zakupyRes = [:]
zakupyRes['pralka'] = 0
zakupyRes['lodowka'] = 0
zakupyRes['zmywarka'] = 0
zakupyRes['ekspress'] = 0

for (value in zakupy.elements()) {
    zakupyRes[value.prop('select_product').stringValue()] += 1
}
execution.setVariable('zakupy', zakupyRes)

wybrany_sklep = execution.getVariable('wybrany_sklep')

zaMalo = false
zakupyRes.each {key, value ->
    if (stan[wybrany_sklep][key as String] < value) {
        zaMalo = true
    }
}
execution.setVariable('brak', zaMalo)
