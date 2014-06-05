LF3LS2
======
Dieses Projekt bildet die Basis für die Lernsituation 2. Momentan ist die Verwendung der in Eclipse integrierten Git-Unterstützung noch nicht in der Schule verfügbar, deshalb ist der Prozess zur Zeit etwas umständlich. Das wird aber besser, wenn in der Schule Eclipse aktualisiert wird (wahrscheinlich in den Sommerferien).

Das Netzwerk der Schule ist durch eine Firewall geschützt. Damit der Zugriff auf Github funktioniert müssen Sie zuerst in Git den Proxy setzen mit
<code>
git --config global http.proxy http://schule\\\\&lt;Benutzername&gt;:&lt;Passwort&gt;@s3:8080
</code>
Ersetzen Sie dabei &lt;Benutzername&gt; mit Ihrem Benutzernamen und &lt;Passwort&gt; mit Ihrem Passwort.

Gehen Sie wie folgt vor:

1. Klonen Sie das Projekt in Ihr Home-Verzeichnis.
2. Untersuchen Sie Historie des Projekts mit git log und vergleichen Sie verschiedene Zwischenstände mit git diff.
3. Starten Sie Eclipse und wählen Sie den Workspace H:\EclipseWorkspace aus.
4. Legen Sie ein neues Projekt mit Namen JumpNRun an.
5. Ziehen Sie die Java-Quellkode-Dateien per drag-and-drop in das src-Verzeichnis im Projekt. 
6. Starten Sie das Programm in Eclipse. Es sollte sich ein leeres Fenster öffnen.
7. Ergänzen Sie den Programmkode wie in den TODOs beschrieben (1. Verschieben des Kreises mit der Tastatur. 2. Informationsdialog ergänzen). Kopieren Sie die geänderten Dateien (*Vorsicht: Nicht verschieben!*) wieder zurück in das geklonte Verzeichnis und committen Sie Ihre Änderungen, immer wenn Sie eine Funktionalität implementiert und getestet haben.

Remote Repositories
-------------------
Diese Aufgabe enthält optional Teile, da ein Account auf Github erstellt werden muss, um alle Teile durchzuführen. Github möchte dabei eine Email-Adresse, an die es eine Verifikations-Email schickt. Auch wenn man diese nicht bestätigt, scheint der Account zu funktionieren. Wer seine Email-Adresse nicht für eine Anmeldung bei Github verwenden möchte, braucht diese Teile nicht auszuführen. In diesem Fall erstellen Sie bitte einen Patch mit git.

1. Erstellen Sie einen kostenfreien Account auf github.com. (Optional)
2. Klonen Sie dieses Projekt in Ihren Account. (Optional - Das geht intuitiv über die Github-Weboberfläche.)
3. Lesen Sie das [Kapitel 5.2 des Pro Git Buchs](http://git-scm.com/book/de/Distribuierte-Arbeit-mit-Git-xxx-An-einem-Projekt-mitarbeiten) als Informationsquelle. Stellen Sie sich dabei die folgenden Verständnisfragen: Was bedeutet clone? Was bedeutet fetch? Was bedeutet pull? Was bedeutet push? Was sind remotes? Kann es mehrere remotes geben?
4. Pushen Sie Ihre Änderungen in Ihr Projekt. (Optional - Das ist schwieriger, sollte aber mit dem Kapitel 5.2 machbar sein.) Wenn Sie diesen Schritt nicht durchführen möchten, dann erstellen Sie bitte hier einen Patch mit git!
5. Erstellen Sie einen Pull-Request, beziehungsweise senden Sie mir ihren Patch per Email.
