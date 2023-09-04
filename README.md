Jogo de Super Trunfo em Java
Bem-vindo ao Jogo de Super Trunfo implementado em Java! Este é um jogo simples onde dois jogadores competem usando cartas de futebol que têm atributos como títulos brasileiros, títulos da Libertadores e títulos mundiais. O objetivo é coletar todas as cartas do oponente.

Como Jogar
Requisitos
Você deve ter o Java instalado em seu sistema.
Certifique-se de que todos os arquivos do jogo estejam em um único diretório.
Iniciando o Jogo
Abra um terminal ou prompt de comando no diretório onde os arquivos do jogo estão localizados.

Compile os arquivos Java executando o seguinte comando:
javac *.java
Isso compilará todos os arquivos Java no diretório.

Agora, você pode iniciar o jogo com o seguinte comando:
java org.example.JogoSuperTrunfo
O jogo começará e você verá as informações da rodada atual, incluindo as cartas dos jogadores e o atributo escolhido.

Jogando o Jogo
O jogo começará com duas cartas para cada jogador.
Cada rodada, você deve escolher um atributo para comparar com o atributo da carta do seu oponente.
O jogador com o atributo mais alto vence a rodada e coleta as cartas daquela rodada.
Se a rodada terminar em empate, as cartas atuais dos jogadores irão para o final da lista de cada um.
O jogador que vencer a rodada atual escolherá o atributo na próxima rodada.
Vencendo o Jogo
O jogo continua até que um dos jogadores colete todas as 32 cartas.
O jogador que possuir todas as cartas vence o jogo.
Encerrando o Jogo
O jogo pode ser encerrado a qualquer momento pressionando Ctrl + C no prompt.
