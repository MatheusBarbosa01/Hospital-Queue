# HOSPITAL-QUEUE
## QUAL O PROBLEMA A SER RESOLVIDO:grey_question:
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

## QUAL A RESOLUÇÃO DO PROBLEMA:grey_question:
- Primeiramente, foi criado uma **classe Paciente**, para podermos adicionar os atributos de um paciente, no caso cpf, nome e prioridade. *É interessante notar que dentro da classe paciente utilizamos um enum, e definimos previamente que as prioridades são apenas 4(Severo, Moderado, Leve e Normal).*
- Em segunda análise, foi criado uma **classe Fila**, para podermos adicionar ou remover um paciente da fila(esta fila foi criado em lista ligada, dessa forma podemos usar os métodos de adicionar sempre na **HEAD**, e remover sempre na **TAIL**).
- Sob esse prisma, foi criado uma **classe GestaoHospital**, e dentro dessa classe foram criados filas, a partir da **classe Fila**, para que dentro dos métodos adicionar e remover, sejam adicionados ou removidos pessoas que serão validadas de acordo com sua prioridade, e seguindo a seguinte lógica: foi pré-definido severo, moderado, leve e normal como booleano,e caso sejam verdadeiros remover uma vez da fila, porém, foram criado dois contadores, para que toda vez que remover um severo adicionar mais 1 no contador, e toda vez que esse contador chegar em 3 ou múltiplo de 3 remover um normal, além disso,  o **contador2**, serve para que toda vez que for removido um moderado, adicionar mais 1 no **contador2**, e toda vez que chegar no 2 ou múltiplo de 2 remover um severo.

#### Dessa forma, a ordem em que ocorrerá a remoção será:
------------------------------------------------------------------------------------------
 1. SEVERO 
 2. MODERADO 
 3. LEVE 
 4. SEVERO 
 5. MODERADO 
 6. SEVERO 
 7. NORMAL

E assim continua mantém a sequência...

