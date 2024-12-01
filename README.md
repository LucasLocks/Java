# Trabalho de Programação Orientada a Objetos I

**Autor: Lucas Locks**

**Objetivo: Desenvolver o projeto 1 (Imposto), projeto 2 (Bar), projeto 3 (Combate) , projeto 4 (Bichinho) e Avaliação 2 (Continentes e países)utilizando Java.**

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

**Descrição do Projeto 4 (Bichinho)**

- Criar um bichinho virtual com algumas características e que
  possui um estado inicial. Depois que “nascer”, ele poderá executar quatro ações: comer, dormir,
  correr e morrer. O jogo só termina quando o bichinho morrer, encerrando o programa.
  Seja um conjunto de animais que possui as características comuns: nome, classe, família,
  idade, estado (vivo = true e morto = false), caloria (0 a 100) e força (0 a 100). Estes animais podem fazer
  as seguintes ações:

  - nascer: perguntar os dados do animal (nome, classe e família). Ao nascer o animal recebe
    10 de força e caloria, 0 (zero) na idade e true como estado;
  - morrer: coloca 0 (zero) na força e false como estado; vida infinita pro bicho
  - comer: caso o animal não esteja cheio e/ou morto, insere 10 no estado caloria e retira 2 de
    força;
  - correr: caso o animal não esteja morto ou exausto (caloria = 0), retira 5 do estado força e 5
    do estado caloria;
  - dormir: caso o animal não esteja morto, insere 10 no estado força e retira 2 do estado
    caloria.

- Resumo das Classes:
  Animal: Contém os atributos e métodos do bichinho virtual. Define suas ações e verifica se ele está "vivo" antes de cada ação.

  Jogo: Gerencia o ciclo do jogo, perguntando ao usuário o que o animal deve fazer até que o animal morra.

**Descrição da Avaliação 2 (Continentes e países)**

- Escreva uma classe que represente um país. Um país é representado através dos atributos:
  código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.: 193.946.886) e a sua dimensão em
  Km2 (ex.: 8.515.767,049). Além disso, cada país mantém uma lista de outros países com os quais ele
  faz fronteira.

- Escreva a classe em Java e forneça os seus membros a seguir:
  a) Construtor que inicialize o código ISO, o nome e a dimensão do país;
  b) Métodos de acesso (getter/setter) para as propriedades código ISO, nome, população e
  dimensão do país;
  c) Um método que permita verificar se dois objetos representam o mesmo país (igualdade
  semântica). Dois países são iguais se tiverem o mesmo código ISO;
  d) Um método que informe se outro país é limítrofe do país que recebeu a mensagem;
  e) Um método que retorne a densidade populacional do país;
  f) Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns aos
  dois países.
- Considere que um país tem no máximo 40 outros países com os quais ele faz fronteira.

- Escreva em Java uma classe Continente. Um continente possui um nome e é composto por
  um conjunto de países. Forneça os membros de classe a seguir:
  a) Construtor que inicialize o nome do continente;
  b) Um método que permita adicionar países aos continentes;
  c) Um método que retorne a dimensão total do continente;
  d) Um método que retorne a população total do continente;
  e) Um método que retorne a densidade populacional do continente;
  f) Um método que retorne o país com maior população no continente;
  g) Um método que retorne o país com menor população no continente;
  h) Um método que retorne o país de maior dimensão territorial no continente;
  i) Um método que retorne o país de menor dimensão territorial no continente;
  j) Um método que retorne a razão territorial do maior país em relação ao menor país.

  - Resumo das Classes:

  1. Classe Pais
     Função: Representa um país específico e seus atributos principais, como nome, população, área e vizinhos.

  Responsabilidades:

  - Armazenar dados básicos de um país (nome, população, área).
  - Manter um conjunto de países vizinhos e permitir adições.
  - Calcular a densidade populacional (população dividida pela área).
  - Fornecer métodos para acessar e manipular as informações do país, como listar vizinhos e imprimir informações detalhadas.

  2. Classe Continente
     Função: Representa um continente e gerencia um conjunto de países que fazem parte dele.

  Responsabilidades:

  - Armazenar o nome do continente e a lista de países que o compõem.
  - Calcular informações agregadas do continente, como a soma de áreas, populações e a densidade populacional média.
  - Identificar o país de maior e menor população e de maior e menor área dentro do continente.
  - Permitir a adição de países ao continente e retornar a lista de países presentes.

  3. Classe Main
     Função: Serve como ponto de entrada do programa, fornecendo a interface de menu para interação com o usuário e controlando o fluxo do programa.

  Responsabilidades:

  - Exibir um menu interativo para o usuário escolher diferentes opções (informações de continentes, densidade populacional de um país, razão territorial do maior e menor país, e vizinhos comuns entre dois países).
  - Coletar a entrada do usuário e chamar os métodos apropriados nas classes Pais e Continente para executar as operações desejadas.
  - Exibir os resultados das operações de forma formatada, como listas de países, densidades populacionais e comparações de áreas.
