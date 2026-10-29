package org.jabref.logic.layout.format;

import org.jabref.logic.layout.LayoutFormatter;
import org.jabref.model.entry.types.BiblatexApaEntryType;
import org.jabref.model.entry.types.BiblatexNonStandardEntryType;
import org.jabref.model.entry.types.EntryTypeFactory;
import org.jabref.model.entry.types.IEEETranEntryType;
import org.jabref.model.entry.types.StandardEntryType;

public class HayagrivaType implements LayoutFormatter {

    /// Maps the display name of any JabRef entry type to a Hayagriva entry type.
    /// Types without a Hayagriva counterpart (including custom and unknown types) are exported as `Misc`.
    @Override
    public String format(String value) {
        return switch (EntryTypeFactory.parse(value)) {
            case StandardEntryType.Article,
                 StandardEntryType.Conference ->
                    "article";
            case StandardEntryType.Book ->
                    "book";
            case StandardEntryType.InBook ->
                    "chapter";
            case StandardEntryType.Report,
                 StandardEntryType.TechReport ->
                    "report";
            case StandardEntryType.Thesis,
                 StandardEntryType.MastersThesis,
                 StandardEntryType.PhdThesis ->
                    "thesis";
            case StandardEntryType.WWW,
                 StandardEntryType.Online ->
                    "web";
            case StandardEntryType.Proceedings ->
                    "proceedings";
            case StandardEntryType.Reference ->
                    "reference";
            case BiblatexNonStandardEntryType.Artwork ->
                    "artwork";
            case BiblatexNonStandardEntryType.Audio,
                 BiblatexNonStandardEntryType.Music ->
                    "audio";
            case BiblatexNonStandardEntryType.Letter ->
                    "letter";
            case BiblatexNonStandardEntryType.Movie,
                 BiblatexNonStandardEntryType.Video ->
                    "video";
            case BiblatexNonStandardEntryType.Performance ->
                    "performance";
            case IEEETranEntryType.Patent ->
                    "patent";
            case IEEETranEntryType.Periodical ->
                    "periodical";
            case BiblatexApaEntryType.Legislation ->
                    "legislation";

            default ->
                    "Misc";
        };
    }
}
