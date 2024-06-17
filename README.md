# SZpets
Como rodar o projeto
Instalação das Dependências:
Certifique-se de ter o Node.js instalado em seu sistema. O Node.js inclui o npm (Node Package Manager), que usaremos para instalar as dependências do projeto.

Navegação até o Diretório do Projeto:
Abra um terminal ou prompt de comando e navegue até o diretório onde está localizado o projeto frontend do React.

Instalação das Dependências:
Execute o seguinte comando para instalar as dependências necessárias listadas no package.json:

npm install

Execução do Servidor de Desenvolvimento:
Após a instalação das dependências, você pode iniciar o servidor de desenvolvimento com o comando:

    npm start

    Isso iniciará o servidor de desenvolvimento do React. Por padrão, ele será executado em http://localhost:3000. Você pode acessar essa URL em seu navegador para visualizar o aplicativo React em execução.

Rodando o Projeto Backend (Java)

    Configuração do Ambiente de Desenvolvimento:
    Para rodar o projeto backend em Java, você precisará de um ambiente de desenvolvimento Java configurado em sua máquina. Certifique-se de ter o JDK (Java Development Kit) instalado. Você pode baixá-lo e instalá-lo a partir do site oficial da Oracle ou OpenJDK.

    IDE (Ambiente de Desenvolvimento Integrado):
    Recomenda-se o uso de uma IDE como Eclipse, IntelliJ IDEA ou VS Code com o plugin adequado para desenvolvimento Java.

    Navegação até o Diretório do Projeto:
    Abra um terminal ou prompt de comando e navegue até o diretório onde está localizado o projeto backend Java.

    Compilação e Execução do Projeto:
    Dependendo de como o projeto foi configurado, você pode compilar e executá-lo diretamente da IDE ou usando ferramentas de linha de comando como Maven ou Gradle.

        Usando Maven (Exemplo):
        Se seu projeto usa Maven como gerenciador de dependências, navegue até o diretório raiz do projeto onde está localizado o arquivo pom.xml e execute os seguintes comandos:

mvn clean install

Isso irá compilar o projeto e instalar as dependências necessárias. Em seguida, você pode iniciar o servidor backend usando o comando:

    mvn spring-boot:run

    Isso iniciará o servidor Spring Boot. Por padrão, ele será executado em http://localhost:8080.

    Outras Opções:
    Se estiver utilizando Gradle ou outra ferramenta de construção, os comandos podem variar ligeiramente, mas geralmente seguirão um processo semelhante de compilação e execução do servidor.

Acessando o Aplicativo:
Após iniciar ambos os servidores (frontend e backend), você poderá acessar o aplicativo completo navegando para http://localhost:3000 no seu navegador. O frontend React fará solicitações ao backend Java conforme necessário para obter dados e interações.

==============================================================================================================================================================================================================================================================================================================

Passo a Passo para Usuários: Utilização do Aplicativo SZpets

Bem-vindo ao SZpets! Este aplicativo ajuda você a encontrar o melhor PetShop com base na data selecionada e no número de cães que você possui. Aqui está como você pode usar:
Passo 1: Selecionar a Data

    No formulário inicial, clique na caixa de seleção de data.
    Um calendário será exibido onde você pode escolher a data desejada. Apenas datas a partir de hoje são permitidas.
    Selecione a data desejada clicando sobre ela no calendário.

Passo 2: Informar o Número de Cães

    Após selecionar a data, insira o número de cães pequenos (menores de 10 kg) e grandes (10 kg ou mais) que você possui nos campos apropriados.
    Os campos de número de cães aceitam apenas valores numéricos maiores ou iguais a zero.

Passo 3: Enviar os Dados

    Depois de selecionar a data e informar o número de cães, clique no botão "Enviar".
    O aplicativo enviará essas informações para o servidor, que calculará e retornará o melhor PetShop com base nos critérios fornecidos.

![image](https://github.com/AndreAugusto0908/SZpets/assets/125704966/9803796c-0b99-41b5-8a37-299c9014ef5f)


Passo 4: Visualizar Resultados

    Uma vez que o servidor responda com os dados do melhor PetShop, você verá essas informações na tela.
    As informações exibidas incluem o nome do PetShop, a distância até o local desejado e o custo total estimado para os serviços.

Passo 5: Navegar pelos Resultados

    Se desejar, você pode visualizar diferentes opções de PetShops, repetindo os passos 1 a 3 com novas datas ou números de cães.
    Cada vez que você enviar um novo conjunto de dados, o aplicativo calculará e exibirá o PetShop mais adequado para você.

![image](https://github.com/AndreAugusto0908/SZpets/assets/125704966/2159a4c9-64ed-45d5-a48e-a2d6aa0a3ea8)


Técnicas Utilizadas no Desenvolvimento:

    React: Utilizei o framework React para criar componentes reutilizáveis e gerenciar o estado da aplicação de forma eficiente.

    React Hooks (useState): Utilizei os hooks do React, como useState, para gerenciar o estado local dentro dos componentes funcionais. Isso me permitiu atualizar dinamicamente a interface do usuário com base nas interações do usuário.

    React-DatePicker: Integrei o componente DatePicker do React-DatePicker para facilitar a seleção de datas de forma amigável ao usuário. Isso garante que as datas inseridas estejam no formato correto e sejam válidas.

    Comunicação com o Servidor: Utilizei fetch API para enviar requisições POST ao servidor backend em Node.js. Isso incluiu o envio de dados formatados em JSON e o tratamento das respostas para exibição dos resultados na interface do usuário.

    Validação de Dados: Implementei validações tanto no frontend quanto no backend para garantir que os dados inseridos sejam válidos e que as respostas do servidor estejam corretas. Isso incluiu verificar se as datas são válidas, se os números de cães são números inteiros e positivos, e se os dados retornados pelo servidor estão no formato esperado.

    Estilização com CSS: Utilizei arquivos CSS para estilizar os componentes e garantir uma interface de usuário agradável e intuitiva. Isso incluiu o uso de classes CSS para definir cores, margens, preenchimentos e outros estilos visuais.
