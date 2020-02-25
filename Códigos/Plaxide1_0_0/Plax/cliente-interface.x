
module 'Cadastro'
	[window id{'Janela-cadastro'}id, width{'400'}width, height{'300'}height, alignX{'50'}alignX, alignY{'20'}alignY, title{'Programa de cadastro'}title] 
		[InputText id{'Campo1'}id, width{'200'}width, height{'20'}height, alignX{'100'}alignX, alignY{'50'}alignY][/InputText]
		[InputText id{'Campo2'}id, width{'200'}width, height{'20'}height, alignX{'100'}alignX, alignY{'80'}alignY][/InputText]
		[InputText id{'Campo3'}id, width{'200'}width, height{'20'}height, alignX{'100'}alignX, alignY{'110'}alignY][/InputText]
		[button id{'Botao-cadastro'}id, width{'100'}width, height{'20'}height, alignX{'100'}alignX, alignY{'150'}alignY] Cadastrar [/button]
	[/window]
endModule => 'Cadastro'.

module 'Login'
	[window id{'Janela-login'}id, width{'400'}width, height{'300'}height, alignX{'200'}alignX, alignY{'20'}alignY, title{'Janela de login'}title backcolor{'#00ff00'}backcolor]
		[InputText id{'Campo4'}id, width{'200'}width, height{'20'}height, alignX{'100'}alignX, alignY{'50'}alignY][/InputText]
		[InputText id{'Campo5'}id, width{'200'}width, height{'20'}height, alignX{'100'}alignX, alignY{'80'}alignY][/InputText]
		[button id{'Botao-login'}id, width{'100'}width, height{'20'}height, alignX{'100'}alignX, alignY{'110'}alignY] Entrar [/button]
	[/window]
endModule => 'Login'.

module 'Conta'
	[window id{'Janela-conta'}id, width{'700'}width, height{'500'}height, alignX{'300'}alignX, alignY{'100'}alignY, title{'Conta do usuario'}title]
		
	[/window]
endModule => 'Conta'.