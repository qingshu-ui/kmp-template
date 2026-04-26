# Development Workflow

## Commit Standards

All commits must be formatted with Spotless before committing:

1. Run `./gradlew spotlessApply` before every commit
2. Stage and commit only the formatted files

## Commit Message Format

Use Conventional Commits format:

- `fix:` - Bug fixes
- `feat:` - New features
- `refactor:` - Code refactoring
- `docs:` - Documentation changes
- `style:` - Formatting, missing semicolons, etc
- `test:` - Adding or updating tests
- `chore:` - Build process, auxiliary tools, etc
