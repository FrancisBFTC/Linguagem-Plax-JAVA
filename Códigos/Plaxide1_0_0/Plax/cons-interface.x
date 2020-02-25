module 'effectWindow'
	[window width{'300'}width, height{'300'}height, alignX{'500'}alignX, alignY{'100'}alignY, back{'black'}back, icon{'C:\\Users\\Casa-Pc\\Desktop\\plaxDyn.jpg'}icon, title{'Dynamics Visual Effects'}title]
		[image alignX{'95'}alignX, alignY{'10'}alignY, width{'230'}width, height{'200'}height path{'C:\\Users\\Casa-Pc\\Desktop\\icone_plax.jpg'}path]
		[button id{'Effect'}id, width{'200'}width, height{'50'}height, alignX{'50'}alignX, alignY{'200'}alignY, back{'black'}back, color{'red'}color] ver efeito [/button]
	[/window]
endModule => 'effectWindow'


module 'First'
	[window back{'blue'}back, icon{'C:\\Users\\Casa-Pc\\Desktop\\icone_plax.jpg'}icon, width{'500'}width, height{'650'}height, title{'JOHANNE FEITA PELA MINHA LINGUAGEM'}title]
		[image id{'minhaImagem1'}id, path{'C:\\Users\\Casa-Pc\\Desktop\\Johanne.jpg'}path, width{'450'}width, height{'470'}height, alignX{'20'}alignX, alignY{'20'}alignY ]
		[button id{'Johanne'}id, back{'black'}back, color{'white'}color, width{'300'}width, height{'50'}height, alignX{'100'}alignX, alignY{'500'}alignY] Botao da johanne [/button]
	[/window]
endModule => 'First'

module 'Second'
	[window back{'blue'}back, icon{'C:\\Users\\Casa-Pc\\Desktop\\icone_plax.jpg'}icon, width{'500'}width, height{'650'}height, alignX{'600'}alignX, alignY{'100'}alignY, title{'OUTRA JANELA DA JOHANNE'}title]
		[image id{'minhaImagem1'}id, path{'C:\\Users\\Casa-Pc\\Desktop\\icone_plax.jpg'}path, width{'450'}width, height{'470'}height, alignX{'20'}alignX, alignY{'20'}alignY ]
		[button id{'Johanne1'}id, back{'black'}back, color{'white'}color, width{'300'}width, height{'50'}height, alignX{'100'}alignX, alignY{'500'}alignY] Botao da johanne [/button]
	[/window]
endModule => 'Second'