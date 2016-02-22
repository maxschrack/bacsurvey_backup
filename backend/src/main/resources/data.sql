
-- USER
INSERT INTO system_user(id, email, password, registration_date, deleted)
VALUES(nextval('seq_system_user_id'), 'max@schrack.info', 'Test1234', '2016-2-17 12:00:00.00', false);
INSERT INTO system_user(id, email, password, registration_date, deleted)
VALUES(nextval('seq_system_user_id'), 'niko@schrack.info', 'Asdf1234', '2016-2-17 12:00:00.00', false);

-- QUESTIONNAIRES FOR USER 1
INSERT INTO questionnaire(id, user_id, name, created, status, progressbar, deleted)
VALUES(nextval('seq_questionnaire_id'), 1, 'Test Questionnaire 1', '2016-2-17 12:00:00.00', 'draft', true, false);
INSERT INTO questionnaire(id, user_id, name, created, status, progressbar, deleted)
VALUES(nextval('seq_questionnaire_id'), 1, 'Test Questionnaire 2', '2016-2-16 13:00:00.00', 'open', true, false);
INSERT INTO questionnaire(id, user_id, name, created, status, progressbar, deleted)
VALUES(nextval('seq_questionnaire_id'), 2, 'Test Questionnaire 3', '2016-2-15 14:00:00.00', 'closed', true, false);

-- PAGES FOR QUESTIONNAIRE 1
INSERT INTO page(id, questionnaire_id, title, text, number, deleted)
VALUES(nextval('seq_page_id'), 1, 'Page 1 of Questionnaire 1', 'Test Text for Page 1 of Questionnaire 1', 0, false);
INSERT INTO page(id, questionnaire_id, title, text, number, deleted)
VALUES(nextval('seq_page_id'), 1, 'Page 2 of Questionnaire 1', 'Test Text for Page 2 of Questionnaire 1', 1, false);
INSERT INTO page(id, questionnaire_id, title, text, number, deleted)
VALUES(nextval('seq_page_id'), 1, 'Page 3 of Questionnaire 1', 'Test Text for Page 3 of Questionnaire 1', 2, false);

