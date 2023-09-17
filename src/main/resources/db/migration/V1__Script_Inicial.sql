CREATE TABLE cliente (
  id_cliente INT PRIMARY KEY,
  nome VARCHAR(50),
  nacionalidade VARCHAR(20),
  estado_civil VARCHAR(20),
  rg INT,
  cpf INT,
  cep INT,
  rua VARCHAR(50),
  numero INT,
  bairro VARCHAR(20),
  cidade VARCHAR(20),
  estado VARCHAR(20)
);

CREATE TABLE terreno (
  id_terreno INT PRIMARY KEY,
  quadra VARCHAR(10),
  lote VARCHAR(10),
  larg_frente FLOAT,
  larg_fundo FLOAT,
  comp_lado_direito INT,
  comp_lado_esquerdo INT,
  nome_rua_limite_terreno VARCHAR(30),


);