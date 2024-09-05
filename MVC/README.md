
# ProjEscolaMVC

Este é um projeto de demonstração do padrão de arquitetura **MVC (Model-View-Controller)** aplicado em um sistema de gerenciamento escolar, desenvolvido em **Java**.

## Índice

- [Descrição](#descrição)
- [Funcionalidades](#funcionalidades)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Como Executar](#como-executar)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuições](#contribuições)
- [Licença](#licença)

## Descrição

O projeto **ProjEscolaMVC** implementa um sistema escolar onde é possível gerenciar alunos, professores, disciplinas e matrículas. O objetivo principal do projeto é demonstrar como o padrão MVC pode ser utilizado para separar a lógica de apresentação, de negócio e de dados em uma aplicação.

## Funcionalidades

- Cadastro de alunos e professores.
- Gerenciamento de disciplinas.
- Matricular alunos em disciplinas.
- Exibir informações sobre alunos, professores e disciplinas cadastradas.

## Estrutura do Projeto

O projeto está organizado segundo o padrão **MVC** da seguinte forma:

- **Model**: Contém as classes que representam os dados e as regras de negócio (e.g., `Aluno`, `Professor`, `Disciplina`, etc.).
- **View**: Responsável pela interface do usuário, gerenciando a interação e exibição de informações (e.g., `JDialog` ou `JFrame` para formulários de cadastro).
- **Controller**: Controla o fluxo de dados entre a **View** e o **Model**, processando os eventos da interface e executando as operações de negócio.

### Estrutura de Pastas

```bash
├── model/         # Classes que representam o modelo de dados (Aluno, Professor, Disciplina, etc.)
├── view/          # Interfaces gráficas (JDialogs, JFrames)
├── controller/    # Classes responsáveis por mediar a interação entre Model e View
└── Main.java      # Ponto de entrada da aplicação
