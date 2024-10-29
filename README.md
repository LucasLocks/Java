# Trabalho de Programação Orientada a Objetos I

**Autor: Lucas Locks**

**Objetivo: Desenvolver o projeto 1 (Imposto) e o projeto 2 (Bar) utilizando Java.**

**Descrição do Projeto 1 (Imposto)**

- Fazer um programa para ler quanto a pessoa obteve de renda anual com salário, prestação de serviço
  e ganho de capital. Leia também quanto a pessoa teve de gastos médicos e educacionais no ano. Seu
  programa deverá então produzir um relatório de imposto de renda dessa pessoa conforme exemplos.
  Considere a renda mensal com salário como sendo a renda anual dividida por 12.
- Resumo das Classes:
  Contribuinte: Armazena os dados do contribuinte.
  ImpostoRenda: Realiza todos os cálculos de impostos;
  RelatorioImposto: Gera o relatório com base nos cálculos;
  Main: Coordena a entrada de dados e a geração do relatório.

**Descrição do Projeto 2 (Bar)**

- Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres. Cada cerveja custa 5 reais,
  cada refrigerante 3 reais e cada espetinho custa 7. Além disso, o bar cobra uma taxa de couvert
  artístico no valor de 4 reais, porém, se o valor gasto com consumo for superior a 30 reais,
  o couvert artístico não é cobrado. Fazer um programa para ler os seguintes dados de um cliente do
  bar: sexo (F ou M), quantidade de cervejas, refrigerantes e espetinhos consumidos. O programa deve
  então mostrar um relatório com a conta a ser paga pelo cliente.

- Resumo das Classes:
  Bar: Contém a lógica relacionada ao consumo e cálculos;
  Relatorio: Responsável por gerar e exibir o relatório;
  Main: Contém o método main e gerencia a entrada do usuário, instanciando os objetos necessários.

**Descrição do Projeto 3 (Combate)**

- Em um jogo de combate, cada jogador joga com um campeão. Cada campeão possui um nome,
  uma quantidade de ataque, armadura e vida. O combate entre dois campeões é organizado em turnos,
  de modo que em cada turno, os dois campeões se atacam. Você deve fazer um programa para
  instanciar dois campeões, depois executar N turnos de combate, mostrando a cada turno o estado de
  cada campeão, conforme exemplos. Se em um turno um dos campeões morrer (quantidade de vida
  igual a zero), o combate deve terminar. Ao final do combate, mostrar na tela "FIM DO COMBATE".
  A regra para um campeão A receber dano de outro campeão B é a seguinte:

1. A quantidade de vida do campeão A deve ser decrescida da quantidade de ataque do campeão B,
   descontada a quantidade de armadura do campeão A. A quantidade de vida resultante não pode ser
   menor que zero.

2. Independente da quantidade de armadura do campeão A, pelo menos 1 de vida o campeão A deve
   perder.

- Resumo das Classes:
  Campeao: A classe Campeao representa um personagem no combate, com atributos de nome, vida, ataque e armadura. Possui métodos para:
  - Receber dano e calcular a redução de vida e armadura.
  - Verificar se o campeão está vivo.
  - Exibir o status atual do campeão (vida e armadura).

Combate: A classe Combate gerencia a batalha entre dois campeões. Ela controla o número de turnos e a ordem dos ataques. A cada turno:

- campeao1 ataca primeiro, e só se campeao2 sobreviver, ele revida.
- O combate termina quando um dos campeões morre, e o vencedor é declarado.

Main: A classe Main serve como ponto de entrada do programa, coletando os dados dos campeões e o número de turnos. Em seguida, inicia
o combate e exibe o resultado final.
