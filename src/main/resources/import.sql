INSERT INTO tb_category (description) VALUES ('Curso');
INSERT INTO tb_category (description) VALUES ('Oficina');


INSERT INTO tb_activity(category_id, name,description, price) VALUES (1,'Curso HTML','Aprenda HTML de forma pratica',80.00);
INSERT INTO tb_activity(category_id, name,description, price) VALUES (2,'Oficiana de GitHub','Controle versões de seus projetos', 50.00);

INSERT INTO tb_participant (name, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participant (name, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participant (name, email) VALUES ('Maria do Rósario', 'mariagmail.com');
INSERT INTO tb_participant (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');


INSERT INTO participant_activity(participant_id, activity_id) VALUES (1, 1);
INSERT INTO participant_activity(participant_id, activity_id) VALUES (1, 2);
INSERT INTO participant_activity(participant_id, activity_id) VALUES (2, 1);
INSERT INTO participant_activity(participant_id, activity_id) VALUES (3, 1);
INSERT INTO participant_activity(participant_id, activity_id) VALUES (3, 2);
INSERT INTO participant_activity(participant_id, activity_id) VALUES (4, 2);

INSERT INTO tb_bloco (start_time, end_time, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T08:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z', 1);

INSERT INTO tb_bloco (start_time, end_time, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-25T18:00:00Z', 2);

INSERT INTO tb_bloco (start_time, end_time, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-26T08:00:00Z', TIMESTAMP WITH TIME ZONE '2017-09-26T11:00:00Z', 2);



