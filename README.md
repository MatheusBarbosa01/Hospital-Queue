# HOSPITAL-ROW
## PROBLEMA A SER RESOLVIDO
Sistema de Atendimento Hospitalar

Você será responsável por desenvolver um algoritmo para controlar a fila de atendimento em um hospital. O sistema deve ser capaz de adicionar pacientes à fila, atender pacientes de acordo com a prioridade e exibir informações sobre a fila de atendimento.

Requisitos:

Implemente uma classe chamada "GestaoHospital" que represente um módulo de gestão de antendimento no hospital. Algumas funcionalidades devem ser observadas:

1. Quando um paciente é adicionado na fila de espera, o algoritmo deve perguntar seu nome, cpf e o nível de prioridade: 0 - normal, 1 - leve, 2 - moderado, 3 - severo.

2. O sistema deve sempre chamar para atendimento um paciente de acordo com a regra a seguir:

Chama 1 paciente severo
Chama 1 paciente moderado
Chama 1 paciente leve
Chama 1 paciente severo
Chama 1 paciente moderado
Chama 1 paciente severo
Chama 1 paciente normal

O sistema deve repetir essa sequência sempre que precisar chamar um paciente. Crie um código main de demonstração que utilize a classe "GestaoHospital" para simular o atendimento de pacientes. O programa deve permitir as seguintes operações:

* Adicionar um paciente à fila, especificando sua prioridade.

* Atender o próximo paciente de acordo com a prioridade.

* Exibir o número de pacientes na fila.

## RESOLUÇÃO DO PROBLEMA
- Primeiramente, foi criado uma classe fila para podermos adicionar ou remover um paciente da fila(esta fila foi criado em lista ligada, dessa forma podemos usar os métodos de adicionar sempre na **HEAD**, e remover sempre na **TAIL**).
