package taskone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

    /**
      Debe indicar si un string contiene caracteres visibles.
      Ejemplos:
      doesStringContainVisibleCharacters("abc") // true
      doesStringContainVisibleCharacters(" abc ") // true
      doesStringContainVisibleCharacters(" ") // false
      doesStringContainVisibleCharacters("\n\t") // false
      doesStringContainVisibleCharacters("") // false
      Sugerencia: revisar funcionalidades como String.isBlank().
     */
    public boolean doesStringContainVisibleCharacters(String string) {
        return string != null && !string.isBlank();
    }


    /**
     Debe dividir un string en líneas.

     Ejemplo:
     splitToLines("line1\nline2\nline3")

     Resultado esperado:
     ["line1", "line2", "line3"]

     Sugerencia: revisar String.lines().
     */
    public List<String> splitToLines(String str) {
        return str == null ? List.of() : str.lines().collect(Collectors.toList());
    }

    /**
     Debe eliminar espacios en blanco al inicio y al final del string, contemplando espacios Unicode.
     Ejemplo:
     trimUnicodeString(" hello ") // "hello"
     Sugerencia: revisar String.strip().
     */
    public String trimUnicodeString(String str) {
        return str == null ? null : str.strip();
    }

    /**
     Debe eliminar espacios en blanco únicamente al inicio del string.
     Ejemplo:
     trimLeft(" hello ") // "hello "
     Sugerencia: revisar String.stripLeading().
     */
    public String trimLeft(String str) {
        return str == null ? null : str.stripLeading();
    }

    /**
     Debe eliminar espacios en blanco únicamente al final del string.
     Ejemplo:
     trimRight(" hello ") // " hello"
     Sugerencia: revisar String.stripTrailing().
     */
    public String trimRight(String str) {
        return str == null ? null : str.stripTrailing();
    }

    /**
     public String repeatStringFiveTimes(String str) {
     return str == null ? null : str.repeat(5);
     }
     */
    public String repeatStringFiveTimes(String str) {
        return str == null ? null : str.repeat(5);
    }

    /**
     Debe recibir una colección/lista de strings y devolver únicamente los strings que no estén vacíos.
     Ejemplo:
     ["a", "", "b", "", "c"]
     Resultado esperado:
     ["a", "b", "c"]
     Se puede considerar como vacío únicamente "", o también strings en blanco como " ", según la implementación inicial
     provista. Documentar el criterio elegido.
     */
    public List<String> filterOutEmptyStrings(List<String> list) {
        // criterio: vacío o blank
        return list.stream()
                .filter(s -> s != null && !s.isBlank())
                .collect(Collectors.toList());
    }

    /**
     saveStringInFile
     Debe guardar el string recibido en un archivo con el nombre indicado.
     Ejemplo conceptual:
     saveStringInFile("hello world", "output.txt");
     Debe crear o sobrescribir el archivo output.txt con el contenido:
     hello world
     Sugerencia: revisar Files.writeString() y Path.of().
     */
    public void saveStringInFile(String content, String fileName) throws IOException {
        Files.writeString(Path.of(fileName), content);
    }

    /**
     Debe leer el contenido completo de un archivo y devolverlo como un único string.
     Ejemplo conceptual:
     readFileContents("output.txt")
     Resultado esperado:
     hello world
     Sugerencia: revisar Files.readString() y Path.of().
     */
    public String readFileContents(String fileName) throws IOException {
        return Files.readString(Path.of(fileName));
    }






}
