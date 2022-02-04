#language: pt
#enconding: UTF-8


Funcionalidade: Eu como um usuário do app 
								Quero criar uma nota de texto e uma Checklist com 3 itens ou mais
								Para organizar minhas tarefas

Cenario: Validar nota de texto

	Dado que eu acesso o aplicativo Notas
	E  crio uma nota de texto
	E digito no campo de texto 
	E clico em salvar 
	Entao o sistema salva a nota
	
	Cenario: Validar Checklist com 3 itens ou mais 

	Dado que eu acesso o aplicativo Notas
	E  crio um checklist
	E adiciono o item 
	E clico em salvar checklist 
	Entao o sistema salva o checklist
	
	Cenario: Validar  alteracao de cor de nota ou lista

	Dado que eu acesso o aplicativo Notas
	E  crio um checklist
	E adiciono o item 
	E clico em salvar checklist 
	E seleciono uma lista
	E clico em editar lista
	E Seleciono a cor 
	Entao a cor sera alterada

Cenario: Validar marcacao de concluido de um item lista	

Dado que eu acesso o aplicativo Notas
	E  crio um checklist
	E adiciono um item 
	E clico em salvar checklist 
	E seleciono uma lista
	E clico sobre o item 
	Entao o item sera concluido
	
Cenario: Validar lembrente de 15 minutos em uma lista	

Dado que eu acesso o aplicativo Notas
	E  crio um checklist
	E  adiciono um item 
	E  clico em salvar checklist
	E  seleciono uma lista
	E  adiciono um lembrete
	Entao o lembrete sera adicionado 