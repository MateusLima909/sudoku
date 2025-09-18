# Sudoku DIO

Este é um projeto de um jogo de Sudoku em Java, desenvolvido como parte do desafio prático da Digital Innovation One (DIO). O objetivo inicial era criar uma aplicação em linha de comando, mas foi evoluído para incluir uma interface gráfica.

O projeto documenta uma jornada de depuração e configuração de ambiente, com o objetivo de demonstrar a capacidade de resolver problemas complexos do mundo real.

---

### Tecnologias Utilizadas

* **Java 17/21**: Linguagem de programação principal.
* **Maven**: Ferenciador de dependências e automação de build.
* **Git & GitHub Codespaces**: Sistema de controle de versão e ambiente de desenvolvimento na nuvem.
* **Swing**: Biblioteca para a construção da interface gráfica.

---

### O Que Foi Feito (Preparação)

A primeira fase deste projeto foi focada na construção de uma base sólida para o desenvolvimento. O trabalho realizado neste estágio incluiu:

* **Configuração do Ambiente de Desenvolvimento**: O ambiente do Codespaces foi totalmente preparado para suportar todas as ferramentas necessárias, incluindo a instalação e compatibilidade do **Java**, **Maven** e o suporte a interfaces gráficas (GUI).

* **Estruturação do Projeto**: A arquitetura do projeto foi ajustada para seguir o padrão do Maven, com a criação do arquivo **`pom.xml`** e a reorganização da estrutura de pastas.

* **Depuração da Lógica e do Ambiente**: Vários bugs críticos foram resolvidos, como a correção de `NullPointerException` (devido a argumentos faltantes), erros de `classpath` e problemas de permissão no Git.

---

### Próximos Passos (Evolução)

Com a base de desenvolvimento totalmente funcional, o projeto entra em sua fase de evolução, focada na melhoria da experiência do usuário e da arquitetura do código. As próximas metas incluem:

* **Refatoração da Interface Gráfica**: A interface atual, que utiliza o antigo **Swing**, será migrada para o **JavaFX**, permitindo um design mais moderno e profissional.

* **Melhoria na Lógica do Jogo**: A estrutura de código será refatorada para aplicar o princípio de Separação de Responsabilidades, isolando a lógica do menu, a lógica do jogo e a lógica da interface em classes distintas.

---

### Como Rodar o Projeto

Para rodar o projeto, abra o terminal no Codespaces e use o comando Maven abaixo. Certifique-se de que os arquivos de configuração `.devcontainer.json` e `.vscode/settings.json` estejam na raiz do projeto.

```bash
mvn exec:java -Dexec.mainClass="br.com.dio.UIMain" -Dexec.args="0,0;4,false 1,0;7,false 2,0;9,true 3,0;5,false 4,0;8,true 5,0;6,true 6,0;2,true 7,0;3,false 8,0;1,false 0,1;1,false 1,1;3,true 2,1;5,false 3,1;4,false 4,1;7,true 5,1;2,false 6,1;8,false 7,1;9,true 8,1;6,true 0,2;2,false 1,2;6,true 2,2;8,false 3,2;9,false 4,2;1,true 5,2;3,false 6,2;7,false 7,2;4,false 8,2;5,true 0,3;5,true 1,3;1,false 2,3;3,true 3,3;7,false 4,3;6,false 5,3;4,false 6,3;9,false 7,3;8,true 8,3;2,false 0,4;8,false 1,4;9,true 2,4;7,false 3,4;1,true 4,4;2,true 5,4;5,true 6,4;3,false 7,4;6,true 8,4;4,false 0,5;6,false 1,5;4,true 2,5;2,false 3,5;3,false 4,5;9,false 5,5;8,false 6,5;1,true 7,5;5,false 8,5;7,true 0,6;7,true 1,6;5,false 2,6;4,false 3,6;2,false 4,6;3,true 5,6;9,false 6,6;6,false 7,6;1,true 8,6;8,false 0,7;9,true 1,7;8,true 2,7;1,false 3,7;6,false 4,7;4,true 5,7;7,false 6,7;5,false 7,7;2,true 8,7;3,false 0,8;3,false 1,8;2,false 2,8;6,true 3,8;8,true 4,8;5,true 5,8;1,false 6,8;4,true 7,8;7,false 8,8;9,false"
